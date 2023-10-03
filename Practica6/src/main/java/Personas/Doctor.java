package Personas;

public class Doctor extends Persona implements IVolar {
    public Doctor(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("Doctor volando.");
    }

    @Override
    public int run() {
        System.out.println("Ingrese la velocidad a la que corre la doctora " + this.getNombre() + ':');
        return sc.nextInt();
    }
}
