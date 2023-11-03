/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aldof
 */
public class saveInfo {
    // Guardar info del servlet
    public saveInfo (String name1, String name2, File archivo) throws IOException {
        FileWriter escritor = new FileWriter(archivo);
        escritor.write("Nombre: " + name1);
        escritor.write("Apellido: " + name2);
        escritor.close();
    }
}
