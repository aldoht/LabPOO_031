package Transportes;

public class Automoviles {
    private String marca;
    private String modelo;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void encenderAuto() {
        System.out.println("Auto encendido");
    }
    public void apagarAuto() {
        System.out.println("Auto apagado");
    }
    public void avanzarAuto() {
        System.out.println("Auto avanzado");
    }
}
