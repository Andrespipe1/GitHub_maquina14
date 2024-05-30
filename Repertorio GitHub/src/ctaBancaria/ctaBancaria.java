package ctaBancaria;

import java.util.Scanner;

public class ctaBancaria {
    public Scanner scanner = new Scanner(System.in);
    public int cedula;
    public String nombre;
    public double monto;


    public ctaBancaria(int cedula, String nombre, double monto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.monto = monto;
    }

    public void mostrar_info() {
        System.out.println("Cedula: " + cedula + " Propietario cta:" + nombre + " Saldo: " + monto);
    }
}

class ctaAhorros extends ctaBancaria {
    int nCuenta;

    public ctaAhorros(int cedula, String nombre, double monto, int nCuenta) {
        super(cedula, nombre, monto);
        this.nCuenta = nCuenta;
    }

    public void depositar() {
        System.out.println("Ingrese el monto que desea ingresar: ");
        double cantidad = scanner.nextDouble();
        monto += cantidad;
        monto = Math.round(monto*100.0)/100.0;
        System.out.println("Depósito realizado. Nuevo saldo: " + monto);
    }

    public void retirar() {
        System.out.println("Ingrese la cantidad que desea retirar: ");
        double retiro = scanner.nextDouble();
        if (retiro <= monto) {
            monto -= retiro;
            monto = Math.round(monto*100.0)/100.0;
            System.out.println("Retiro realizado. Nuevo saldo: " + monto);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
    public void mostrar_saldo() {
        mostrar_info();
        System.out.println("Inf Cta: " + nCuenta + " Saldo: " + monto);
    }
}
