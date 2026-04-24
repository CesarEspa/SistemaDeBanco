
public class CuentaCorriente extends CuentaBancaria {

    private double comision;
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo,
                           double comision, double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.comision = comision;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= -limiteSobregiro) {
            saldo -= (monto + comision);
            System.out.println("Retiro con comisión: " + comision);
        } else {
            System.out.println("Excede el límite de sobregiro");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Cuenta Corriente");
    }
}