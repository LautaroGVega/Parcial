package com.example;


import java.util.ArrayList;
import java.util.List;

public class Arbitro extends ArbitroBase{
private List<TarjetaBase> tarjetas = new ArrayList<>();

        public Arbitro(String name) {
            super(name);
        }

    public void agregarTarjetaRoja(IJugador jugador, Partido partido) {
        TarjetaRoja tarjetaJugador = new TarjetaRoja(jugador);
        partido.agregar(tarjetaJugador);
    }
    
    public void agregarTarjetaAmarilla(IJugador jugador, Partido partido) {
        TarjetaAmarilla tarjetaJugador = new TarjetaAmarilla(jugador);
        partido.agregar(tarjetaJugador);
    }

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }
        
}

