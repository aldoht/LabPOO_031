package Transportes;

public abstract class Transporte {
    public abstract void encenderMotor(int combustible);
    public void avanzar() {
        System.out.println("Transporte avanzando.");
    }
    public abstract void apagarMotor();
}
