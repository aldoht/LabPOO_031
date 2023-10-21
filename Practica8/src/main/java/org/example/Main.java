package org.example;
import funciones.funcionesString;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("**MENÚ**");
            System.out.println("1. Saber la cantidad de un caracter en cierta cadena.");
            System.out.println("2. Determinar dígitos y letras de una cadena.");
            System.out.println("3. Determinar la longitud de una cadena.");
            System.out.println("4. Leer una cadena e imprimir la cantidad de vocales junto con ellas.");
            System.out.println("5. Invertir una cadena.");
            System.out.println("6. Determinar la cadena de mayor longitud de tres.");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 6)
                System.out.println("Opción no válida.");
        } while (opcion < 1 || opcion > 6);
        System.out.print("Ingrese una cadena: ");
        sc.nextLine();
        String str = sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el caracter a buscar: ");
                char c = sc.next().charAt(0);
                funcionesString fs = new funcionesString(c, str);
                break;
            case 2, 4, 3, 5:
                funcionesString fS = new funcionesString(str, opcion);
                break;
            case 6:
                ArrayList<String> strArr= new ArrayList<String>(3);
                strArr.add(str);
                System.out.print("Ingrese otra cadena: ");
                strArr.add(sc.nextLine());
                System.out.print("Ingrese otra cadena: ");
                strArr.add(sc.nextLine());
                funcionesString Fs = new funcionesString(strArr);
        }
    }
}