package libs;

public abstract class Calculadora {
    public abstract double div(double a, double b);
    public void mult(double a, double b) {
        System.out.println("El resultado de " + a + " * " + b + " es " + (a*b) + '.');
    }
}
