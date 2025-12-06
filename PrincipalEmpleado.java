package Modulos;

import java.util.Scanner;
import Modulos.Empleado;

public class PrincipalEmpleado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingresa la clave del empleado: ");
        String clave = entrada.nextLine();

        System.out.print("Ingresa el salario mensual: ");
        double salario = entrada.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos: ");
        double impuesto = entrada.nextDouble();

        // Hacer un empleado con los datos dados
        Empleado emp1 = new Empleado(clave, salario, impuesto);

        // Mostramos salario neto
        System.out.println("\nSalario neto: " + emp1.salarioNeto());

        // Pedir aumento
        System.out.print("\nIngresa porcentaje de aumento: ");
        double aumento = entrada.nextDouble();

        // Aplicamos aumento
        emp1.aumentarSalario(aumento);

        // Mostramos salario ya aumentado
        System.out.println("Nuevo salario mensual: " + emp1.getSalarioMensual());

        entrada.close();
    }
}
