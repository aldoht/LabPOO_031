package Personas;

public class Abogado extends Persona implements IVolar{
    public Abogado(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("Abogado volando.");
    }

    @Override
    public int run() {
        return 6;
    }
}
