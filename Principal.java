package Modulos;

import java.util.Scanner;
import Modulos.Libros;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entradas del usuario
        System.out.print("Ingresa el ID del libro: ");
        String id = entrada.nextLine();

        System.out.print("Ingresa el nombre del autor: ");
        String autor = entrada.nextLine();

        System.out.print("Ingresa el año de publicación: ");
        int anioPublicacion = entrada.nextInt();

        System.out.print("Ingresa el año actual: ");
        int anioActual = entrada.nextInt();

        // Se crea el libro con los datos del usuario
        Libros libro1 = new Libros(id, autor, anioPublicacion);

        // Mostramos si está disponibleo nel
        System.out.println("\n¿Está disponible?: " + libro1.isDisponible());

        // Verificamos si es apto para préstamo
        boolean apto = libro1.aptoParaPrestamo(anioActual);
        System.out.println("¿Es apto para préstamo? " + apto);

        // Reservar libro
        System.out.println("\nIntentando reservar...");
        libro1.reservar();

        // Mostramos disponibilidad luego de reservar
        System.out.println("¿Está disponible ahora?: " + libro1.isDisponible());

        entrada.close();
    }
}
