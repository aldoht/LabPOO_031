package Personas;
import java.util.Scanner;

public abstract class Persona {
    private String nombre;
    Scanner sc = new Scanner(System.in);
    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int run();
}
