package com.example.pruebagr4ma23b;

public interface InterfaceTarjeta {
    public RespuestaTarjeta solicitudDePago(SolicitudTarjeta solicitudPago);
    public RespuestaTarjeta cancelarPago(SolicitudTarjeta solicitudcancelar);
}

