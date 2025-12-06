package Modulos.Ejercicio3;
import java.util.Scanner;

public class PrincipalRectangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la base del rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = entrada.nextDouble();

        entrada.nextLine(); // limpio buffer, quitamos labasura que quedó

        System.out.print("Ingresa la etiqueta del rectángulo: ");
        String etiqueta = entrada.nextLine();

        // hacemos un rectangulo con los dataos que dio el usuario
        Rectangulo r1 = new Rectangulo(base, altura, etiqueta);

        // Mostramos área y perímetro
        System.out.println("\nEtiqueta: " + r1.getEtiqueta());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        entrada.close();
    }
}
