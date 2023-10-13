package Arreglos;
import Transportes.Automoviles;
import java.util.Scanner;

public class PracticaArreglos {
    Scanner sc = new Scanner(System.in);
    public void readArray() {
        String[] name = new String[5];
        name[0] = "Aldo";
        name[1] = "Lucas";
        name[2] = "Pedro";
        name[3] = "Luis";
        name[4] = "Brad";
        for (int i = 0; i < name.length; i++) {
            System.out.println("Nombre " + Integer.toString(i+1) + ": " + name[i]);
        }
    }
    public void leerAutoArray() {
        Automoviles[] auArr = new Automoviles[5];
        for (int i = 0; i < auArr.length; i++) {
            auArr[i] = new Automoviles();
            System.out.println("Ingrese la marca del auto " + Integer.toString(i+1) + ':');
            auArr[i].setMarca(sc.nextLine());
            System.out.println("Ingrese el modelo del auto " + Integer.toString(i+1) + ':');
            auArr[i].setModelo(sc.nextLine());
        }
        for (Automoviles au: auArr) {
            System.out.println("Marca del auto: " + au.getMarca() + ". Modelo del auto: " + au.getModelo());
            au.encenderAuto();
            au.avanzarAuto();
            au.apagarAuto();
        }
    }
}
