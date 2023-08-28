package org.example;
import Aereo.Avion;
import Maritimo.Barco;
import Terrestre.Autobus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        //Creación de objetos de las clases hijas
        Avion av = new Avion();
        Barco br = new Barco();
        Autobus au = new Autobus();

        //Entrada y validación de combustible, y entrada del modelo
        do {
            System.out.println("Ingrese la cantidad de combustible del " + av.getName() + ".");
            av.setCombustible(sc.nextInt());
            if (av.getCombustible() < 0)
                System.out.println("La cantidad de combustible no puede ser inferior a cero.");
            else {
                System.out.println("Ingrese el modelo del " + av.getName() + ".");
                av.setModelo(sc.next());
            }
        } while (av.getCombustible() < 0);
        do {
            System.out.println("Ingrese la cantidad de combustible del " + br.getName() + ".");
            br.setCombustible(sc.nextInt());
            if (br.getCombustible() < 0)
                System.out.println("La cantidad de combustible no puede ser inferior a cero.");
            else {
                System.out.println("Ingrese el modelo del " + br.getName() + ".");
                br.setModelo(sc.next());
            }
        } while (br.getCombustible() < 0);
        do {
            System.out.println("Ingrese la cantidad de combustible del " + au.getName() + ".");
            au.setCombustible(sc.nextInt());
            if (au.getCombustible() < 0)
                System.out.println("La cantidad de combustible no puede ser inferior a cero.");
            else {
                System.out.println("Ingrese el modelo del " + au.getName() + ".");
                au.setModelo(sc.next());
            }
        } while (au.getCombustible() < 0);

        //Movimiento de los vehiculos
        av.movimiento();
        br.movimiento();
        au.movimiento();
    }
}