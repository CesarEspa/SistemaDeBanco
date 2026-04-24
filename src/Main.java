
public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaAhorros("001", "Cesar", 100000, 0.02, 50000);
        CuentaBancaria cuenta2 = new CuentaCorriente("002", "Empresa X", 200000, 2000, 50000);
        CuentaBancaria cuenta3 = new CuentaInversion("003", "Inversionista", 500000, 12, 0.05);

        System.out.println("=== OPERACIONES ===");

        cuenta1.depositar(20000);
        cuenta1.retirar(80000);

        cuenta2.retirar(230000);

        cuenta3.retirar(100000);

        System.out.println("\n=== RESULTADOS ===");

        cuenta1.mostrarInfo();
        System.out.println();

        cuenta2.mostrarInfo();
        System.out.println();

        cuenta3.mostrarInfo();
    }
}