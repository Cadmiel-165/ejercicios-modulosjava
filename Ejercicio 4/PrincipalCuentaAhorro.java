package Modulos.Ejercicio4;

import java.util.Scanner;
public class PrincipalCuentaAhorro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir datos de la cuenta
        System.out.print("Número de cuenta: ");
        String numero = entrada.nextLine();

        System.out.print("Nombre del titular: ");
        String nombre = entrada.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = entrada.nextDouble();

        // Crear cuenta
        CuentaAhorro c1 = new CuentaAhorro(numero, nombre, saldoInicial);

        // Hacer depósito
        System.out.print("Cantidad a depositar: ");
        double dep = entrada.nextDouble();
        c1.depositar(dep);

        System.out.println("Saldo después del depósito: " + c1.getSaldo());

        // Hacer retiro
        System.out.print("Cantidad a retirar: ");
        double ret = entrada.nextDouble();

        boolean sePudo = c1.retirar(ret);

        if (sePudo) {
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("No se puede retirar esa cantidad.");
        }

        System.out.println("Saldo final: " + c1.getSaldo());

        entrada.close();
    }
}
