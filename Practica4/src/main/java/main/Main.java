package main;

import Vehiculos.Autobus;
import Vehiculos.Avion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horaAvion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese la hora del vuelo.");
            horaAvion = sc.nextInt();
            if (horaAvion < 1 || horaAvion > 24)
                System.out.println("Hora no válida.");
        } while (horaAvion < 1 || horaAvion > 24);

        Avion av = new Avion(horaAvion);
        System.out.println("Avión 1 (salida a las " + horaAvion + ":00): ");
        System.out.println("Pasajeros: " + av.getPasajeros());
        System.out.println("Combustible: " + av.getCombustible());
        av.encenderMotor(av.getCombustible());
        av.volar(av.getCombustible());
        System.out.println();

        Avion av2 = new Avion(20, "VivaAerobus", 100);
        System.out.println("Pasajeros: " + av2.getPasajeros());
        System.out.println("Combustible: " + av2.getCombustible());
        av2.encenderMotor(av2.getCombustible());
        av2.avanzar();
        av2.volar(av2.getCombustible());
        av2.aterrizar();
        av2.apagarMotor();
        System.out.println();

        Autobus au = new Autobus(15, 0);
        System.out.println("Autobús 1:");
        System.out.println("Pasajeros: " + au.getPasajeros());
        System.out.println("Marca: " + au.getMarca());
        System.out.println("Combustible: " + au.getCombustible());
        au.encenderMotor(au.getCombustible());
        au.volar(au.getCombustible());
        System.out.println();

        Autobus au2 = new Autobus("Toyota", 100);
        System.out.println("Autobús 2:");
        System.out.println("Pasajeros: " + au2.getPasajeros());
        System.out.println("Marca: " + au2.getMarca());
        System.out.println("Combustible: " + au2.getCombustible());
        au2.encenderMotor(au2.getCombustible());
        au2.volar(au2.getCombustible());
        au2.aterrizar();
        au2.apagarMotor();
    }
}