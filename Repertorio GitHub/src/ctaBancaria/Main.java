package ctaBancaria;

public class Main {
    public static void main(String[] args) {
        ctaAhorros cuenta1 = new ctaAhorros(1754270864, "Juan", 200, 2244015);
        cuenta1.mostrar_info();
        cuenta1.depositar();
        cuenta1.retirar();
        cuenta1.mostrar_saldo();
    }
}

