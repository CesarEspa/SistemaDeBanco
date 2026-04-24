package sistemaBancario;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaZully = new CuentaAhorros("1223","zully tamayo",35000,32.3,4);
        CuentaBancaria cuentaLeider = new CuentaCorriente("344657","Leider",45000.4,45,3);
        CuentaBancaria cuentaCesar = new CuentaInversion("12412424","Cesar",67000.7,12,3,12);

        CuentaBancaria[] cuentas = {cuentaZully,cuentaLeider,cuentaCesar};

        for (CuentaBancaria c : cuentas) {
            System.out.println(c.describir());
            System.out.println("Comisión actual: $" + c.calcularComision());
            c.realizarRetiro(500000.0);
            System.out.println("Saldo tras retiro de $500k: $" + c.getSaldo());
            System.out.println("-----------------------------------");
        }

    }

        /*
           RESPUESTA A LA PREGUNTA:
           Fue necesario usar CuentaBancaria como tipo de variable para tratar a todos
           los objetos de forma genérica.Puedo crear una lista de cuentas y procesarlas (describirlas,
           retirar dinero) sin que el código necesite saber exactamente qué tipo de
           cuenta es cada una. Esto hace que el código sea más limpio y fácil de mantener.
        */
}
