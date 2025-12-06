package Modulos.Ejercicio4;
public class CuentaAhorro {

    // Datos de la cuenta
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Depositar dinero
    public void depositar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    // Retirar dinero (solo si alcanza)
    public boolean retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo = this.saldo - cantidad;
            return true; // retiro exitoso
        } else {
            return false; // no alcanza el saldo
        }
    }

    // Obtener saldo
    public double getSaldo() {
        return this.saldo;
    }
}
