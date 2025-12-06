package Modulos.Ejercicio6;

public class Empleado {

    // Datos del empleado
    private String clave;
    private double salarioMensual;
    private double porcentajeImpuesto;

    // Constructor
    public Empleado(String clave, double salarioMensual, double porcentajeImpuesto) {
        this.clave = clave;
        this.salarioMensual = salarioMensual;
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    // Calcular salario neto
    public double salarioNeto() {
        double impuesto = salarioMensual * (porcentajeImpuesto / 100);
        return salarioMensual - impuesto;
    }

    // Aumentar salario
    public void aumentarSalario(double porcentajeAumento) {
        double aumento = salarioMensual * (porcentajeAumento / 100);
        salarioMensual = salarioMensual + aumento;
    }

    // Getter para ver el salario después del aumento
    public double getSalarioMensual() {
        return salarioMensual;
    }
}
