package Terrestre;

import Transporte.VehiculosTransporte;

public class Autobus extends VehiculosTransporte {
    private int pasajeros = 15;

    private void recogerPasajero(int pasajeros) {
        System.out.println("Se han recogido 5 pasajeros.");
        pasajeros += 5;
    }
    private void bajarPasajero(int pasajeros) {
        System.out.println("Se han bajado 3 pasajeros.");
        pasajeros -= 3;
    }
    @Override
    public String encenderMotor(int combustible) {
        String msg;
        if (combustible > 0)
            msg = "Se han introducido las llaves y se ha encendido el motor.";
        else
            msg = "No hay suficiente gasolina para encender el motor.";
        return msg;
    }

    @Override
    public void avanzar(int combustible) {
        if (combustible > 0)
            System.out.println("Se ha quitado el freno de mano y el autobús está en marcha.");
        else
            System.out.println("No hay suficiente gasolina para encender el autobús.");

    }

    @Override
    public void detener(int combustible) {
        if (combustible > 0)
            System.out.println("El autobús se ha detenido con el freno.");
        else {
            System.out.println("El autobús está descontrolado a una alta velocidad.");
            System.out.println("Choque inminente.");
        }
    }

    @Override
    public String getName() {
        return "Autobús";
    }

    @Override
    public void movimiento() {
        System.out.println("MOVIMIENTO DEL AUTOBÚS");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println(this.encenderMotor(this.getCombustible()));
        if (this.getCombustible() > 0) {
            System.out.println("Pasajeros: " + this.pasajeros);
            this.avanzar(this.getCombustible());
            this.setCombustible(this.getCombustible() - 10);
            if (this.getCombustible() > 0) {
                this.recogerPasajero(this.pasajeros);
                this.bajarPasajero(this.pasajeros);
                System.out.println("Pasajeros: " + this.pasajeros);
                this.vueltaDerecha(this.getCombustible());
                this.setCombustible(this.getCombustible() - 10);
                if (this.getCombustible() > 0) {
                    this.recogerPasajero(this.pasajeros);
                    this.bajarPasajero(this.pasajeros);
                    System.out.println("Pasajeros: " + this.pasajeros);
                    this.vueltaIzquierda(this.getCombustible());
                    this.setCombustible(this.getCombustible() - 10);
                }
            }
        }
        this.detener(this.getCombustible());
        this.pasajeros = 0;
    }
}
