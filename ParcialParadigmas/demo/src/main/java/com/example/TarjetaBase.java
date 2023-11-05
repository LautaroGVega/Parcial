package com.example;

public abstract class TarjetaBase{


    private String color;
    private IJugador jugador;


    public TarjetaBase(String color, IJugador jugador) {
        setColor(color);
        setJugador(jugador);
    }

    public String getColor() {
        return color;
    }
   
    public void setColor(String value) {
        this.color = value;
    }

    public IJugador getJugador() {
        return jugador;
    }

    private void setJugador(IJugador jugador) {
        this.jugador = jugador;

           }


   
    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}
