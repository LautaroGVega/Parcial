package com.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String name;
    private String abreviatura;
    private List<Jugador> jugadores;

    public Equipo(String name, String abreviatura) {
        this.name = name;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAbreviatura() {
        return abreviatura;
    }
    
    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int jugadoresCantidad() {
        return jugadores.size();
    }

    public Jugador obtenerJugador(int numero) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNumero() == numero) {
                return jugador;
            }
        }
        return null;
    }
}

