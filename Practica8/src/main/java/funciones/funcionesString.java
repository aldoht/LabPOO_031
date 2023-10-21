package funciones;
import java.util.Scanner;
import java.util.ArrayList;

public class funcionesString {
    Scanner sc = new Scanner(System.in);
    public funcionesString(String str, int op) {
        char[] cadena = str.toCharArray();
        switch (op) {
            case 2:
                ArrayList<Character> digitos = new ArrayList<Character>();
                ArrayList<Character> letras = new ArrayList<Character>();
                for (Character e: cadena) {
                    if (Character.isDigit(e))
                        digitos.add(e);
                    else if (Character.isLetter(e))
                        letras.add(e);
                }
                if (!digitos.isEmpty()) {
                    System.out.print("Dígitos: ");
                    for (Character d: digitos)
                        System.out.print(d);
                    System.out.println();
                }
                if (!letras.isEmpty()) {
                    System.out.print("Letras: ");
                    for (Character l: letras)
                        System.out.print(l);
                    System.out.println();
                }
                System.out.println();
                break;
            case 3:
                int i = 0;
                System.out.println("Longitud con el método length: " + str.length() + '.');
                for (Character a: cadena)
                    i++;
                System.out.println("Longitud sin el método length: " + i + '.');
                System.out.println();
                break;
            case 4:
                int count = 0;
                ArrayList<Character> vocales = new ArrayList<Character>();
                char[] voc = {'a', 'e', 'i', 'o', 'u'};
                for (Character r: cadena) {
                    for (Character z: voc) {
                        if (Character.toLowerCase(r) == z) {
                            count++;
                            vocales.add(r);
                        }
                    }
                }
                if (!vocales.isEmpty()) {
                    System.out.println("Cantidad de vocales: " + count + '.');
                    System.out.print("Vocales: ");
                    for (Character j: vocales)
                        System.out.print(j);
                    System.out.println();
                }
                else
                    System.out.println("No hay vocales en la cadena.");
                System.out.println();
                break;
            case 5:
                StringBuilder rev = new StringBuilder(str);
                System.out.println("Cadena invertida: " + rev.reverse());
                System.out.println();
                break;
        }
    }
    public funcionesString(ArrayList<String> strArr) {
        int mayorLugar = 0;
        for (String g: strArr)
            if (g.length() > strArr.get(mayorLugar).length())
                mayorLugar = strArr.indexOf(g);
        System.out.println("Cadena de mayor longitud: " + strArr.get(mayorLugar) + '.');
        System.out.println("Longitud de la cadena: " + strArr.get(mayorLugar).length() + '.');
    }
    public funcionesString(char c, String str) {
        int count = 0;
        for (Character a: str.toCharArray()) {
            if (a == c)
                count++;
        }
        System.out.println("Cantidad de caracteres " + c + " en la cadena: " + count);
        System.out.println();
    }
}
