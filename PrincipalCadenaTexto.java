package Modulos.Ejercicio10;

import java.util.Scanner;

public class PrincipalCadenaTexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.print("Ingresa la cadena de texto: ");
        String texto = entrada.nextLine();

        System.out.print("Ingresa el identificador del módulo: ");
        String id = entrada.nextLine();

        System.out.print("Ingresa la longitud máxima permitida: ");
        int longitud = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        // Creamos objeto CadenaTexto
        CadenaTexto cadena = new CadenaTexto(texto, id, longitud);

        // Mostramos la cadena original
        System.out.println("\nCadena original: " + cadena.getTexto());

        // Pedimos un prefijo y agregarlo
        System.out.print("Ingresa un prefijo para agregar: ");
        String prefijo = entrada.nextLine();
        cadena.agregarPrefijo(prefijo);
        System.out.println("Cadena con prefijo: " + cadena.getTexto());

        // Contamos espacios en la cadena
        int espacios = cadena.contarEspacios();
        System.out.println("Cantidad de espacios en la cadena: " + espacios);

        entrada.close();
    }

}
