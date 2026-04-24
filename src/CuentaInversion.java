

public class CuentaInversion extends CuentaBancaria {

    private int plazoMeses;
    private double tasaInteres;

    public CuentaInversion(String numeroCuenta, String titular, double saldo,
                           int plazoMeses, double tasaInteres) {
        super(numeroCuenta, titular, saldo);
        this.plazoMeses = plazoMeses;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro anticipado con penalización");
        saldo -= (monto + 10000);
    }

    public void generarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println("Interés inversión: " + interes);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Cuenta Inversión");
    }
}