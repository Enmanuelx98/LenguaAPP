package pe.edu.upc.modelos.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@RestController
@RequestMapping("/api/models")
public class Modelcontroller {

    @GetMapping("/{type}")
    public ResponseEntity<Resource> getModelByType(@PathVariable String type) throws IOException {
        String folderPath = "models/";
        String extension;

        if (type.equals("tflite")) {
            extension = ".tflite";
        } else if (type.equals("json")) {
            extension = ".json";
        } else {
            return ResponseEntity.badRequest().body(null);
        }

        // Buscar archivo dentro de la carpeta resources/models/
        ClassPathResource folderResource = new ClassPathResource(folderPath);
        File folder = folderResource.getFile();

        File[] matchingFiles = folder.listFiles((dir, name) -> name.endsWith(extension));

        if (matchingFiles == null || matchingFiles.length == 0) {
            return ResponseEntity.notFound().build();
        }

        File selectedFile = matchingFiles[0]; // puedes agregar lógica para elegir el más reciente si hay varios

        InputStream inputStream = new FileInputStream(selectedFile);
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + selectedFile.getName() + "\"")
                .body(resource);
    }

    @GetMapping("/mensaje")
    public Map<String, String> mensaje() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola desde el backend");
        return response;
    }
}
