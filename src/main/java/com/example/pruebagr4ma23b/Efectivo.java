package com.example.pruebagr4ma23b;

public class Efectivo {
    private boolean pagado=false;

    private double montoApagar;

    public Efectivo(double montoApagar) {
        this.montoApagar = montoApagar;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

}
