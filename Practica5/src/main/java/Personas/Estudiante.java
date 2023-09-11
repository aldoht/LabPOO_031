package Personas;

public class Estudiante extends Persona implements IVolar{
    public Estudiante(String nombre) {
        super(nombre);
    }


    @Override
    public int run() {
        return 9;
    }

    @Override
    public void volar() {
        System.out.println("Estudiante volando.");
    }
}
