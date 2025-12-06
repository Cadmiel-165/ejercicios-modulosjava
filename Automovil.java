package Modulos.Ejercicio5;

public class Automovil {

    // Datos del carro
    private String marca;
    private int anioFabricacion;
    private int velocidadMaxima;

    // Constructor
    public Automovil(String marca, int anioFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodo para encender el carro
    public String encender() {
        int antiguedad = 2025 - this.anioFabricacion; // usando año actual directamente

        if (antiguedad <= 25) {
            return "El vehículo encendió correctamente.";
        } else {
            return "El vehículo es muy antiguo y no encendió.";
        }
    }

    // Metodo para calcular antigüedad
    public int calcularAntiguedad(int anioActual) {
        return anioActual - this.anioFabricacion;
    }
}
