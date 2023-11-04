/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Path ruta = new File("datos.txt").toPath();
        System.out.println(ruta.toString());
    }
}
