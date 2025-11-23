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

    //Palabras que poseen los modelos
    @GetMapping("/mensajeLSP")
    public Map<String, String> mensajeLSP() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, buenos dias, hola, por favor, gracias, bien, buenas noches, buenas tardes, cual, de nada, mal, mas o menos, nombre, tu, yo, casa, estudiar, edad, no, chau, donde");
        return response;
    }
    @GetMapping("/mensajeASL")
    public Map<String, String> mensajeASL() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, good morning, hello, please, thanks you, fine, good night, good afternoon, which, you are welcome, bad, so so, name, you, me, home, study, age, no, goodbye, where");
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
        //File carpeta = new File("src/main/resources/ImagenesCursos/ImagenesTodo");
        File carpeta = new File("/app/imagenes");

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
