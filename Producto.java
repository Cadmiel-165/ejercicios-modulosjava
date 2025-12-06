package Modulos;

public class Producto {

    // Atributos privados
    private String referencia;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public Producto(String referencia, int cantidad, double precioUnitario) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    // Getters y Setters
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Comportamiento 1, suma mas piezas al stock
    public void aumentarStock(int cantidadEntrada) {
        this.cantidad = this.cantidad + cantidadEntrada;
    }

    // Comportamiento 2, calcula cuanto vale todo el stock
    public double valorTotal() {
        return this.cantidad * this.precioUnitario;
    }
}
