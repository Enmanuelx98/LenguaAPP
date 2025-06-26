package pe.edu.upc.modelos.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Objects;

@RestController
@RequestMapping("/api/models")
public class Modelcontroller {

    @GetMapping("/{type}")
    public ResponseEntity<Resource> getModelByType(@PathVariable String type) throws IOException {
        // Determinar extensión del archivo que se busca
        String extension;
        if (type.equals("tflite")) {
            extension = ".tflite";
        } else if (type.equals("json")) {
            extension = ".json";
        } else {
            return ResponseEntity.badRequest().body(null);
        }

        // Buscar el archivo dentro del classpath
        String folderPath = "models/";
        String[] modelFiles = Objects.requireNonNull(new ClassPathResource(folderPath).getFile().list());

        for (String fileName : modelFiles) {
            if (fileName.endsWith(extension)) {
                Resource resource = new ClassPathResource(folderPath + fileName);
                String contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;

                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType(contentType))
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                        .body(resource);
            }
        }

        return ResponseEntity.notFound().build();
    }
    @GetMapping("/mensaje")
    public Map<String, String> mensaje() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola desde el backend");
        return response;
    }
}
