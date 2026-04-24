package sistemaBancario;

public class CuentaCorriente extends CuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String describir(){
        return super.describir() + "Comision por transaccion : " +comisionPorTransaccion;
    }

    @Override
    public double calcularComision(){
        return comisionPorTransaccion;
    }
    @Override
    public void realizarRetiro(double monto){
        double montoTotal = monto + calcularComision();
        if(getSaldo()-montoTotal<-limiteSobregiro){
            System.out.println("Supera el limite, no se puede procesar.");
        }else{
            setSaldo(getSaldo()-montoTotal);
        }
    }
}