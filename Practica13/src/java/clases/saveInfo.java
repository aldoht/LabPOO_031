/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author aldof
 */
public class saveInfo {
    // Guardar info del servlet
    private Path path;
    public saveInfo(Path ruta) throws IOException {
        this.path = ruta;
        if (Files.notExists(ruta))
            Files.createFile(ruta);
    }
    public String escribir(String nombre1, String nombre2) throws IOException {
        Files.write(path, List.of(nombre1 + ' ' + nombre2 + '\n'), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        return path.toAbsolutePath().toString();
    }
}
