package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;

    public Var(Partido partido) {
        this.partido = partido;
    }
    
    public int cantidadTarjetas(Equipo pEquipo){
        // have a list of players of pEquipo to reference searching for cards
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

