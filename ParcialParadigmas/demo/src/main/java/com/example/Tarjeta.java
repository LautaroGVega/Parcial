package com.example;

public class Tarjeta {
    private String color;
    private Jugador jugador;

    public Tarjeta(String color, Jugador jugador) {
        this.color = color;
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
   }

    public Jugador getJugador() {
        return jugador;
    }
    
}
