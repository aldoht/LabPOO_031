package Aereo;

import Transporte.VehiculosTransporte;

public class Avion extends VehiculosTransporte {
    private boolean volando = false;
    private void aterrizar() {
        System.out.println("El avión ha aterrizado correctamente.");
    }
    @Override
    public String encenderMotor(int combustible) {
        String msg;
        if (combustible > 0)
            msg = "El motor del avión se ha encendido.";
        else
            msg = "No hay combustible suficiente para encender el avión.";
        return msg;
    }

    @Override
    public void avanzar(int combustible) {
        if (combustible > 0) {
            System.out.println("Se ha removido el freno, el avión ha despegado de la autopista y está en el aire.");
            this.volando = true;
        }
        else
            System.out.println("El avión no tiene suficiente combustible para avanzar.");
    }

    @Override
    public void detener(int combustible) {
        if (combustible > 0 && this.volando) {
            System.out.println("El avión comienza a descender a la autopista.");
            this.aterrizar();
        }
        else {
            System.out.println("El avión se ha apagado en el aire, preparen la evacuación del avión.");
            System.out.println("Avión estrellado. Todos los pasajeros y miembros del personal lograron salir a tiempo y están esperando su rescate.");
        }
    }

    @Override
    public String getName() {
        return "Avion";
    }

    @Override
    public void movimiento() {
        System.out.println("MOVIMIENTO DEL AVIÓN");
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
        this.volando = false;
    }
}
