package libs;

public class MyLib extends Calculadora{
    @Override
    public double div(double a, double b) {
        return a/b;
    }
    public MyLib(double a, double b) {
        System.out.println("El resultado de " + a + " + " + b + " es " + this.suma(a, b) + '.');
    }

    public double suma(double a, double b) {
        return a+b;
    }

    public double resta(double a, double b) {
        return a-b;
    }
}
