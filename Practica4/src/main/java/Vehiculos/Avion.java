package Vehiculos;

import Transportes.Transporte;
import Transportes.iVolar;

public class Avion extends Transporte implements iVolar {
    public Avion(int hora) {
        //Métodos privados pueden ejecutarse en el constructor
        //Pueden haber varios métodos con el mismo nombre, pero debe cambiar la firma (sobrecarga)

        if (hora < 8 || hora > 19)
            this.encenderLuces();
    }
    public Avion(int numPasajeros, String nombreAvion, int combustible) {
        setPasajeros(numPasajeros);
        System.out.println("Avión de la aerolínea " + nombreAvion + '.');
        setCombustible(combustible);
    }
    private int combustible;
    private int pasajeros;

    private void encenderLuces() {
        System.out.println("Luces encendidas.");
    }

    @Override
    public void encenderMotor(int combustible) {
        if (combustible <= 0)
            System.out.println("No hay combustible suficiente para encender el motor del avión.");
        else
            System.out.println("Motor del avión encendido.");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Motor del avión apagado.");
    }

    @Override
    public void volar(int combustible) {
        if (combustible <= 0)
            System.out.println("No hay combustible suficiente para volar.");
        else
            System.out.println("Avión volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("Avión aterrizando.");
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
