package com.mycompany.practica_2;

public class Transportes {
    private float combustible;
    private int pasajeros;

    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
     
    public String encenderMotor() {
        return "Motor encendido.";
    }

    public String apagarMotor() {
        return "Motor apagado.";
    }
    
}
