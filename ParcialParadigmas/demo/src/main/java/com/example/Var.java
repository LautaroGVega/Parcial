package com.example;

import java.util.List;


public class Var {
    private Partido partido;

    public Var(Partido partido) {
        this.partido = partido;
    }
    
    public int cantidadTarjetas(Equipo pEquipo){
        List<IJugador> jugadores = pEquipo.getJugadores();
        List<TarjetaBase> tarjetas = this.partido.getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> jugadores.contains(tarjeta.getJugador())).
                count();
    }

    public int cantidadTarjetasRojas() {
        int cont = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaRoja) {
                cont++;
            }
        }
        return cont;
    }

    
    public int cantidadTarjetasAmarillas() {
        int cont = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaAmarilla) {
                cont++;
            }
        }
        return cont;
    }


}

