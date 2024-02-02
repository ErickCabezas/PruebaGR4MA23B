package com.example.pruebagr4ma23b;

public class RespuestaTarjeta {
    enum EstadoDeSolicitud {
        OK, ERROR;
    }
    private EstadoDeSolicitud estadoDeSolicitud;

    public RespuestaTarjeta(EstadoDeSolicitud estadoDeSolicitud) {
        this.estadoDeSolicitud = estadoDeSolicitud;
    }

    public EstadoDeSolicitud getEstadoDeSolicitud() {
        return estadoDeSolicitud;
    }
}
