package com.mycompany.practica_2;

public class Automovil extends Transportes {
    private String color = "Sin color.";
    private int velocidad;
    
    public String acelerar() {
        setVelocidad(100);
        return "Acelerando.";
    }
    public String frenar() {
        setVelocidad(0);
        return "Frenando.";
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
