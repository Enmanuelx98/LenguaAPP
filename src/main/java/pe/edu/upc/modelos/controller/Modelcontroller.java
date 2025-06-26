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

@RestController
@RequestMapping("/api/models")
public class Modelcontroller {

    @GetMapping("/{type}")
    public ResponseEntity<Resource> getModelByType(@PathVariable String type) throws IOException {
        String filename;
        if (type.equals("tflite")) {
            filename = "models/asl_modelov2_pruebav2.tflite";
        } else if (type.equals("json")) {
            filename = "models/asl_labels_modelov2_pruebav2.json";
        } else {
            return ResponseEntity.badRequest().build();
        }

        ClassPathResource resource = new ClassPathResource(filename);
        if (!resource.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
    @GetMapping("/mensaje")
    public Map<String, String> mensaje() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola desde el backend");
        return response;
    }
}
