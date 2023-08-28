package Maritimo;

import Transporte.VehiculosTransporte;

public class Barco extends VehiculosTransporte {
    private boolean navegando;
    private void elevarAncla() {
        System.out.println("Se ha levantado el ancla del barco.");
    }
    private void anclar() {
        System.out.println("El barco ha sido anclado correctamente en el puerto.");
    }
    @Override
    public String encenderMotor(int combustible) {
        String msg;
        if (combustible > 0)
            msg = "El motor del barco se ha encendido elevando una palanca.";
        else
            msg = "No hay combustible suficiente para encender el avión.";
        return msg;
    }

    @Override
    public void avanzar(int combustible) {
        if (combustible > 0) {
            this.elevarAncla();
            System.out.println("El barco está en marcha.");
            this.navegando = true;
        }
        else
            System.out.println("El avión no tiene suficiente combustible para avanzar.");
    }

    @Override
    public void detener(int combustible) {
        if (combustible > 0 && this.navegando) {
            System.out.println("El barco está siendo anclado en el puerto.");
            anclar();
        }
        else {
            System.out.println("El barco se encuentra a la deriva.");
            System.out.println("Se lanzan señales de ayuda con la esperanza de ser rescatados.");
        }
    }

    @Override
    public String getName() {
        return "Barco";
    }

    @Override
    public void movimiento() {
        System.out.println("MOVIMIENTO DEL BARCO");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println(this.encenderMotor(this.getCombustible()));
        if (this.getCombustible() > 0) {
            this.avanzar(this.getCombustible());
            this.setCombustible(this.getCombustible() - 10);
            if (this.getCombustible() > 0) {
                this.vueltaDerecha(this.getCombustible());
                this.setCombustible(this.getCombustible() - 10);
                if (this.getCombustible() > 0) {
                    this.vueltaIzquierda(this.getCombustible());
                    this.setCombustible(this.getCombustible() - 10);
                }
            }
        }
        this.detener(this.getCombustible());
        this.navegando = false;
    }
}
