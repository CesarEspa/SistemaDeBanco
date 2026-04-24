
public class CuentaBancaria {

    protected String numeroCuenta;
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: " + monto);
        } else {
            System.out.println("Monto inválido");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado: " + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void mostrarInfo() {
        System.out.println("----- INFO CUENTA -----");
        System.out.println("Número: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}