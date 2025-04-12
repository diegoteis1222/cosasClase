package Bancos;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000)
            activa = true;
        else
            activa = false;
    }

    public CuentaAhorros(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual,
                         float comisionMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.activa = activa;
    }

    @Override
    public void retirar(float cantidad) {
        //Si la cuenta está activa
        if (activa)
            //retira dinero
            super.retirar(cantidad);
    }

    @Override
    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }

    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

}
