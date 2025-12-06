package Modulos;

public class Rectangulo {

    // Atributos privados
    private double base;
    private double altura;
    private String etiqueta;

    // Constructor
    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    // Getter y Setter de base
    public double getBase() { return this.base; }
    public void setBase(double base) { this.base = base; }

    // Getter y Setter de altura
    public double getAltura() { return this.altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Getter y Setter de etiqueta
    public String getEtiqueta() { return this.etiqueta; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

    // Metodo 1: calcular área
    public double calcularArea() {
        return this.base * this.altura;
    }

    // Metodo 2: calcular perímetro
    public double calcularPerimetro() {
        return (this.base * 2) + (this.altura * 2);
    }
}
