package Modulos;

public class Libros {

    // Atributos privados
    private String id;
    private String autor;
    private boolean disponible;
    private int anioPublicacion;

    // Constructor
    public Libros(String id, String autor, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    // Getters y Setters
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getAutor() { return this.autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public boolean isDisponible() { return this.disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public int getAnioPublicacion() { return this.anioPublicacion; }
    public void setAnioPublicacion(int anio) { this.anioPublicacion = anio; }

    // Comportamiento 1: Reservar libro
    public void reservar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("El libro ha sido reservado.");
        } else {
            System.out.println("El libro ya no está disponible.");
        }
    }

    // Comportamiento 2: Apto para préstamo
    public boolean aptoParaPrestamo(int anioActual) {
        int antiguedad = anioActual - this.anioPublicacion;
        return antiguedad <= 5;
    }
}
