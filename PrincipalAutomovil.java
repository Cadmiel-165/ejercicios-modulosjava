package Modulos;

import java.util.Scanner;
import Modulos.Automovil;

public class PrincipalAutomovil {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Datos del usuario
        System.out.print("Ingresa la marca del auto: ");
        String marca = entrada.nextLine();

        System.out.print("Ingresa el año de fabricación: ");
        int anio = entrada.nextInt();

        System.out.print("Ingresa la velocidad máxima: ");
        int velocidad = entrada.nextInt();

        System.out.print("Ingresa el año actual: ");
        int anioActual = entrada.nextInt();

        // Hacer un auto con los datos
        Automovil auto1 = new Automovil(marca, anio, velocidad);

        // Mostramos si enciende, si jala
        System.out.println("\n" + auto1.encender());

        // Mostramos antigüedad
        int antiguedad = auto1.calcularAntiguedad(anioActual);
        System.out.println("Antigüedad del vehículo: " + antiguedad + " años");

        entrada.close();
    }
}

