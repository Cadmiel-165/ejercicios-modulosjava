package Modulos.Ejercicio8;

public class Temperatura {

    // Datos de la temperatura
    private double valor;
    private String unidad; // "C" o "F"
    private String fecha;

    // Constructor
    public Temperatura(double valor, String unidad, String fecha) {
        this.valor = valor;
        this.unidad = unidad;
        this.fecha = fecha;
    }

    // Metodo para convertir temperatura
    public void convertir() {
        if (unidad.equalsIgnoreCase("C")) {
            valor = (valor * 9 / 5) + 32;
            unidad = "F";
        } else if (unidad.equalsIgnoreCase("F")) {
            valor = (valor - 32) * 5 / 9;
            unidad = "C";
        }
    }

    // Metodo para verificar si es extrema
    public boolean esExtrema() {
        if (unidad.equalsIgnoreCase("C")) {
            return valor > 40;
        } else if (unidad.equalsIgnoreCase("F")) {
            return valor > 104;
        } else {
            return false;
        }
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getFecha() {
        return fecha;
    }

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
