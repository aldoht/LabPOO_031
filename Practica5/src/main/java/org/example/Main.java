package org.example;
import Personas.*;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        float promedio = 0;
        System.out.println("Hello world!");

        Persona dr = new Doctor("Rebeca");
        Persona st = new Estudiante("Aldo");
        Persona en = new Ingeniero("Hilario");
        Persona lw = new Abogado("Eduardo");

        promedio = dr.run() + st.run() + en.run() + lw.run();
        promedio /= 4;

        System.out.println("El promedio de las velocidades es " + promedio + "km/h.");
    }
}