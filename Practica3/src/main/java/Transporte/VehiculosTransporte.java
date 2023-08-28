package Transporte;

public abstract class VehiculosTransporte {
    private String modelo;
    private int combustible;
    public abstract String encenderMotor(int combustible);
    public abstract void avanzar(int combustible);
    public abstract void detener(int combustible);
    public void vueltaIzquierda(int combustible) {
        if (combustible > 0)
            System.out.println("Vuelta hacia la izquierda.");
    }
    public void vueltaDerecha(int combustible) {
        if (combustible > 0)
            System.out.println("Vuelta hacia la derecha.");
    }
    public abstract String getName();
    public abstract void movimiento();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}
