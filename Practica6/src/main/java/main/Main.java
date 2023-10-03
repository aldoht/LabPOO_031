package main;
import Personas.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        float promedio = 0;
        System.out.println("Hello, World!");

        // Creación de objetos //
        Persona dr = new Doctor("Rebeca");
        Persona st = new Estudiante("Aldo");
        Persona lw = new Abogado("Eduardo");
        Persona en = new Ingeniero("Hilario");

        // Creación del ArrayList //
        ArrayList<Persona> personas = new ArrayList<Persona>(4);
        personas.add(dr);
        personas.add(st);
        personas.add(lw);
        personas.add(en);

        // Ciclo For Each //
        for (Persona elem: personas) {
            promedio += elem.run();
        }

        // Cálculo de promedio //
        promedio /= 4;
        System.out.println("El promedio de velocidad es de " + promedio + " km/h.");

    }

}
