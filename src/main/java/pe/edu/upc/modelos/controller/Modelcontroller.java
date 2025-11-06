package pe.edu.upc.modelos.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@RestController
@RequestMapping("/models")
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

    //Palabras que poseen los modelos
    @GetMapping("/mensajeLSP")
    public Map<String, String> mensajeLSP() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "hola, buenos días, buenas noches, por favor, adiós, disculpa, gracias, cómo estás, te quiero, mañana, tarde, noche, comer, beber, estudiar, trabajar, familia, amigo, casa");
        return response;
    }
    @GetMapping("/mensajeASL")
    public Map<String, String> mensajeASL() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "hello, good morning, good night, please, goodbye, sorry, thank you, how are you, I love you, tomorrow, afternoon, night, eat, drink, study, work, family, friend, home, ");
        return response;
    }

    //Cargar el ZIP con imagenes y demas
    @GetMapping("/imagenes")
    public ResponseEntity<Resource> descargarImagenes() throws IOException {
        String filename = "ImagenesCursos/ImagenesTodo.zip";
        ClassPathResource resource = new ClassPathResource(filename);

        if (!resource.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
    //cantidad de imagenes en la carpeta
    @GetMapping("/imagenes/count")
    public ResponseEntity<Integer> contarImagenes() {
        File carpeta = new File("src/main/resources/ImagenesCursos/ImagenesTodo1");

        // Verifica si la carpeta existe y es válida
        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("La carpeta no existe o no es un directorio válido: " + carpeta.getAbsolutePath());
            return ResponseEntity.ok(0);
        }

        File[] imagenes = carpeta.listFiles((dir, name) ->
                name.toLowerCase().endsWith(".png") || name.toLowerCase().endsWith(".jpg"));

        // Si listFiles devuelve null, evita el NullPointerException
        if (imagenes == null) {
            System.out.println("No se pudieron listar las imágenes en: " + carpeta.getAbsolutePath());
            return ResponseEntity.ok(0);
        }

        int cantidad = imagenes.length;
        System.out.println("Imágenes encontradas: " + cantidad);
        return ResponseEntity.ok(cantidad);
    }


}
