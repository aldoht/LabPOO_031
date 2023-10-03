package Personas;

public class Estudiante extends Persona implements IVolar {
    public Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("Estudiante volando.");
    }

    @Override
    public int run() {
        System.out.println("Ingrese la velocidad a la que corre el estudiante " + this.getNombre() + ':');
        return sc.nextInt();
    }
}
