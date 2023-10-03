package Personas;

public class Ingeniero extends Persona implements IVolar{
    public Ingeniero(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("Ingeniero volando.");
    }

    @Override
    public int run() {
        System.out.println("Ingrese la velocidad a la que corre el ingeniero " + this.getNombre() + ':');
        return sc.nextInt();
    }
}
