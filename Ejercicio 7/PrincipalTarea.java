package Modulos.Ejercicio7;

import java.util.Scanner;

public class PrincipalTarea {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pido la descripción
        System.out.print("Ingresa la descripción de la tarea: ");
        String desc = entrada.nextLine();

        // Pido la prioridad
        System.out.print("Ingresa la prioridad (Baja, Media o Alta): ");
        String prioridad = entrada.nextLine();

        // Creo la tarea
        Tarea t1 = new Tarea(desc, prioridad);

        // Muestro si es urgente
        System.out.println("\n¿La tarea es urgente?: " + t1.esUrgente());

        // Marco como completada
        System.out.println("Marcando tarea como completada...");
        t1.marcarCompletada();

        // Muestro estado final
        System.out.println("¿La tarea está completada?: " + t1.getCompletada());

        entrada.close();
    }
}
