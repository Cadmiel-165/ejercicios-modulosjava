
package Modulos;

public class Tarea {

    // Datos de la tarea
    private String descripcion;
    private String prioridad;
    private boolean completada;

    // Constructor
    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false; // Al inicio no está completada
    }

    // Marcar tarea como completada
    public void marcarCompletada() {
        completada = true;
    }

    // Ver si es urgente (prioridad alta y no completada)
    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }

    // Getter para ver si está completada al final
    public boolean getCompletada() {
        return completada;
    }

    // Getter de prioridad para mostrarla
    public String getPrioridad() {
        return prioridad;
    }
}
