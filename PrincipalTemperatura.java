package Modulos;

import java.util.Scanner;

public class PrincipalTemperatura {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el valor de la temperatura: ");
        double valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Ingresa la unidad (C/F): ");
        String unidad = entrada.nextLine();

        System.out.print("Ingresa la fecha de registro: ");
        String fecha = entrada.nextLine();

        Temperatura temp = new Temperatura(valor, unidad, fecha);

        System.out.println("\nValor: " + temp.getValor());
        System.out.println("Unidad: " + temp.getUnidad());
        System.out.println("Fecha: " + temp.getFecha());

        temp.convertir();
        System.out.println("\nDespués de convertir:");
        System.out.println("Valor: " + temp.getValor());
        System.out.println("Unidad: " + temp.getUnidad());

        if (temp.esExtrema()) {
            System.out.println("La temperatura es EXTREMA.");
        } else {
            System.out.println("La temperatura es NORMAL.");
        }

        entrada.close();
    }


}

