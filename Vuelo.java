package Modulos;


public class Vuelo {


    // Datos del vuelo
    private String codigo;
    private int capacidadMaxima;
    private int asientosReservados;

    // Constructor
    public Vuelo(String codigo, int capacidadMaxima, int asientosReservados) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    // Metodo para reservar un asiento
    public void reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            System.out.println("Reserva realizada correctamente.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    // Metodo para calcular porcentaje de ocupación
    public double porcentajeOcupacion() {
        return ((double) asientosReservados / capacidadMaxima) * 100;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }


}
