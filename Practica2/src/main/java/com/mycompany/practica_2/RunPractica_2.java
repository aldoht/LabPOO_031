package com.mycompany.practica_2;

public class RunPractica_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Mazda
        Automovil mazda = new Automovil();
        mazda.setPasajeros(4);
        mazda.setCombustible((float) 65.9);
        mazda.setColor("Rojo");
        System.out.println("Iniciando recorrido del Mazda.");
        System.out.println(mazda.encenderMotor());
        System.out.println("Color: " + mazda.getColor());
        System.out.println("Combustible: " + mazda.getCombustible());
        System.out.println("Pasajeros: " + mazda.getPasajeros());
        System.out.println("Velocidad: " + mazda.getVelocidad());
        System.out.println(mazda.acelerar());
        System.out.println("Velocidad: " + mazda.getVelocidad());
        System.out.println(mazda.frenar());
        mazda.setCombustible((float) 26.5);
        System.out.println("Combustible: " + mazda.getCombustible());
        System.out.println("Velocidad: " + mazda.getVelocidad());
        System.out.println(mazda.apagarMotor());
        System.out.println("Fin del recorrido del Mazda.");
        // Boeing 747
        Avion boeing747 = new Avion();
        boeing747.setPasajeros(80);
        boeing747.setCombustible(100);
        System.out.println("Iniciando recorrido del Boeing 747.");
        System.out.println(boeing747.encenderMotor());
        boeing747.setCiArea("Viva Aerobus.");
        System.out.println("Compañía: " + boeing747.getCiArea());
        System.out.println("Combustible: " + boeing747.getCombustible());
        System.out.println("Pasajeros: " + boeing747.getPasajeros());
        boeing747.despegar();
        boeing747.volar();
        boeing747.setCombustible((float) 23.4);
        boeing747.aterrizar();
        System.out.println("Combustible: " + boeing747.getCombustible());
        System.out.println(boeing747.apagarMotor());
        System.out.println("Fin del recorrido del Boeing 747.");
    }
}
