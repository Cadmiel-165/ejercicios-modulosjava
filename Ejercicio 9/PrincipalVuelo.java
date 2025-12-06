package Modulos.Ejercicio9;

import java.util.Scanner;

public class PrincipalVuelo {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir datos del vuelo
        System.out.print("Ingresa el código del vuelo: ");
        String codigo = entrada.nextLine();

        System.out.print("Ingresa la capacidad máxima de asientos: ");
        int capacidad = entrada.nextInt();

        System.out.print("Ingresa el número actual de asientos reservados: ");
        int reservados = entrada.nextInt();

        Vuelo vuelo = new Vuelo(codigo, capacidad, reservados);

        System.out.println("\n--- Datos del vuelo ---");
        System.out.println("Código: " + vuelo.getCodigo());
        System.out.println("Capacidad máxima: " + vuelo.getCapacidadMaxima());
        System.out.println("Asientos reservados: " + vuelo.getAsientosReservados());

        // Intentamos reservar un asiento
        System.out.println("\nIntentando reservar un asiento...");
        vuelo.reservarAsiento();

        // Mostramos porcentaje de ocupación
        double porcentaje = vuelo.porcentajeOcupacion();
        System.out.println("Porcentaje de ocupación: " + porcentaje + "%");

        entrada.close();
    }


}
