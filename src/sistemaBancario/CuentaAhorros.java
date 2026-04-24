package sistemaBancario;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String titular, int saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String describir() {
        return super.describir() + "Tasa mensual : "+ tasaInteresMensual;

    }

    @Override
    public double calcularComision(){
        return (getSaldo()<saldoMinimo)? 12000.0 : 0.0;
    }

    public void realizarRetiro(double monto, boolean esUrgente) {
        double totalADescontar = monto;
        if (esUrgente && (getSaldo() - monto < saldoMinimo)) {
            totalADescontar += 12000.0;
        }
        setSaldo(getSaldo() - totalADescontar);
    }

    public double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100;
    }

}