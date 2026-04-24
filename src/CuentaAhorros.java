

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo,
                         double tasaInteres, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;

            if (saldo < saldoMinimo) {
                System.out.println(" Comisión por saldo bajo");
                saldo -= 5000;
            }

            System.out.println("Retiro en ahorros: " + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void generarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println("Interés generado: " + interes);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Cuenta Ahorros");
    }
}