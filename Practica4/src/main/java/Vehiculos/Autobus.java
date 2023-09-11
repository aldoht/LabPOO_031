package Vehiculos;

import Transportes.Transporte;
import Transportes.iVolar;

public class Autobus extends Transporte implements iVolar {
    private int pasajeros;
    private String marca;
    private int combustible;
    public Autobus(int numPasajeros, int combustible) {
        setPasajeros(numPasajeros);
        setCombustible(combustible);
    }
    public Autobus(String marca, int combustible) {
        setMarca(marca);
        setCombustible(combustible);
    }
    @Override
    public void encenderMotor(int combustible) {
        if (combustible > 0)
            System.out.println("Motor del autobús encendido.");
        else
            System.out.println("No hay suficiente combustible para encender el motor.");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Motor del autobús apagado.");
    }

    @Override
    public void volar(int combustible) {
        if (combustible > 0)
            System.out.println("Autobús en marcha.");
        else
            System.out.println("No hay suficiente combustible para arrancar el autobús.");
    }

    @Override
    public void aterrizar() {
        System.out.println("Frenando el autobús.");
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}
