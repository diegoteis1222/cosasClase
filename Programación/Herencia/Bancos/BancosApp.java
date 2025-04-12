package Bancos;

import java.util.Scanner;

public class BancosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuenta de ahorros");

        System.out.print("Ingrese saldo inicial: ");
        float saldoInicialAhorros = sc.nextFloat();

        System.out.print("Ingrese tasa de interés: ");
        float tasaAhorros = sc.nextFloat();

        Bancos.CuentaAhorros cuenta1 = new Bancos.CuentaAhorros(saldoInicialAhorros, tasaAhorros);

        System.out.println("Ingresa catidad a depositar: ");
        float cantidadDepositar = sc.nextFloat();

        cuenta1.consignar(cantidadDepositar);

        System.out.println("Ingresa catidad a retirar: ");
        float cantidadRetirar = sc.nextFloat();

        cuenta1.retirar(cantidadRetirar);

        System.out.println("Calcula el EXTRACTO del mes:");
        cuenta1.extractoMensual();

        System.out.println(cuenta1.toString());

        System.out.println("Cuenta corriente");

        System.out.print("Ingrese saldo inicial: ");
        float saldoInicialCorriente = sc.nextFloat();

        System.out.print("Ingrese tasa de interés: ");
        float tasaCorriente = sc.nextFloat();

        CuentaCorriente cuenta2 = new CuentaCorriente(saldoInicialCorriente, tasaCorriente);

        System.out.println("Ingresa catidad a depositar: ");
        float ingreso = sc.nextFloat();

        cuenta2.consignar(ingreso);

        System.out.println("Ingresa catidad a retirar: ");
        float retiro = sc.nextFloat();

        cuenta2.retirar(retiro);

        System.out.println("Calcula el EXTRACTO del mes:");
        cuenta2.extractoMensual();

        System.out.println(cuenta2.toString());
    }
}

