package Modulos.Ejercicio2;

import java.util.Scanner;

public class PrincipalProducto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entradas del usuario
        System.out.print("Referencia del producto: ");
        String ref = entrada.nextLine();

        System.out.print("Cantidad actual en stock: ");
        int cant = entrada.nextInt();

        System.out.print("Precio unitario: ");
        double precio = entrada.nextDouble();

        // Crea producto
        Producto p1 = new Producto(ref, cant, precio);

        // Mostramos el valor total
        System.out.println("\nValor total del stock: " + p1.valorTotal());

        // Aumentamos el stock
        System.out.print("\nIngresa cantidad a agregar al stock: ");
        int extra = entrada.nextInt();

        p1.aumentarStock(extra);

        // Mostramos el valor total actualizadito
        System.out.println("Nueva cantidad: " + p1.getCantidad());
        System.out.println("Nuevo valor total: " + p1.valorTotal());

        entrada.close();
    }
}

