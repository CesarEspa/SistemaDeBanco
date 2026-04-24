package sistemaBancario;

public class CuentaInversion extends CuentaBancaria {
    private int plazoMeses;
    private double tasaInteres;
    private double penalizacion;

    public CuentaInversion(String numeroCuenta, String titular, double saldo,
                           int plazoMeses, double tasaInteres, double penalizacion) {
        super(numeroCuenta, titular, saldo);
        this.plazoMeses = plazoMeses;
        this.tasaInteres = tasaInteres;
        this.penalizacion = penalizacion;
    }

    @Override
    public String describir() {
        return super.describir() +
                " Plazo (meses): " + plazoMeses +
                " Tasa interés: " + tasaInteres;
    }
    @Override
    public double calcularComision() {
        return penalizacion;
    }

    @Override
    public void realizarRetiro(double monto) {
        double total = monto + calcularComision();

        if (getSaldo() >= total) {
            System.out.println(" Retiro con penalización por inversión");
            setSaldo(getSaldo() - total);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double calcularInteres() {
        return getSaldo() * tasaInteres / 100;
    }

}