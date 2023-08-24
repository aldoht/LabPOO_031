package com.mycompany.practica_2;

public class Avion extends Transportes{
    public String getCiArea() {
        return ciArea;
    }
    public void despegar() {
        System.out.println("Avion despegando.");
    }
    public void aterrizar() {
        System.out.println("Avion aterrizando.");
    }

    public void setCiArea(String ciArea) {
        this.ciArea = ciArea;
    }
    private String ciArea;
    public void volar() {
        System.out.println("Avion volando.");
    }
}
