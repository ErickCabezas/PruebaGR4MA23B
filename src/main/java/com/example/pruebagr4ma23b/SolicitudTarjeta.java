package com.example.pruebagr4ma23b;

public class SolicitudTarjeta {
    private double montoApagar;
    private boolean cancelarPago=false;

    public SolicitudTarjeta(double montoApagar) {
        this.montoApagar = montoApagar;
    }
    public SolicitudTarjeta(boolean cancelarPago) {
        this.cancelarPago = cancelarPago;
    }

    public double getMontoApagar() {
        return montoApagar;
    }
}
