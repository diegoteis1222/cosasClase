package Bancos;

public class CuentaCorriente extends Cuenta {

    float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa); // Invoca al constructor de la clase padre
        sobregiro = 0; // Inicialmente no hay sobregiro
    }

    // completo
    public CuentaCorriente(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual,
                           float comisionMensual, float sobre) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.sobregiro = sobre;

    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad; // Se calcula un saldo temporal

        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        // Si existe sobregiro la cantidad consignada se resta al sobregiro
        if (sobregiro > 0) {
            if (residuo > 0) { /* Si el residuo es mayor que cero, se libera el sobregiro */
                sobregiro = 0;
                saldo = residuo;
            } else { /* Si el residuo es menor que cero, el saldo es cero y surge un sobregiro */
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
            /* Si no hay sobregiro, se realiza una consignación normal */
        }
    }

    public void extractoMensual() {
        super.extractoMensual(); // Invoca al método de la clase padre
    }

    @Override
    public String toString() {
        return "CuentaCorriente [sobregiro=" + sobregiro + ", saldo=" + saldo + ", numeroConsignaciones="
                + numeroConsignaciones + ", numeroRetiros=" + numeroRetiros + ", tasaAnual=" + tasaAnual
                + ", comisionMensual=" + comisionMensual + "]";
    }
}
