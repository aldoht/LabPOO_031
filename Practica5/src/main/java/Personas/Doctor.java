package Personas;

public class Doctor extends Persona implements IVolar{
    public Doctor(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("Doctora volando.");
    }

    @Override
    public int run() {
        return 10;
    }
}
