package pe.edu.upc.modelos.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/models")
public class Modelcontroller {
    private static final String MODEL_FOLDER = "src/main/resources/models/";

    @GetMapping("/{type}")
    public ResponseEntity<Resource> getModelByType(@PathVariable String type) throws IOException {
        File folder = new File(MODEL_FOLDER);
        if (!folder.exists() || !folder.isDirectory()) {
            return ResponseEntity.notFound().build();
        }

        // Buscar el único archivo del tipo solicitado
        File[] matchingFiles = folder.listFiles((dir, name) -> {
            if (type.equals("tflite")) return name.endsWith(".tflite");
            else if (type.equals("json")) return name.endsWith(".json");
            else return false;
        });

        if (matchingFiles == null || matchingFiles.length == 0) {
            return ResponseEntity.notFound().build();
        }

        File file = matchingFiles[0]; // toma el primer archivo que coincida
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        String contentType = Files.probeContentType(file.toPath());

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType != null ? contentType : "application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"")
                .body(resource);
    }
    @GetMapping("/mensaje")
    public Map<String, String> mensaje() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola desde el backend");
        return response;
    }
}
