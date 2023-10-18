package com.example;

import java.util.List;

public class Var {
    private Partido partido;

    public Var(Partido partido) {
        this.partido = partido;
    }

    public int cantidadTarjetasRojas() {
        int count = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaRoja) {
                count++;
            }
        }
        return count;
    }

    public int cantidadTarjetasAmarillas() {
        int count = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaAmarilla) {
                count++;
            }
        }
        return count;
    }
}

