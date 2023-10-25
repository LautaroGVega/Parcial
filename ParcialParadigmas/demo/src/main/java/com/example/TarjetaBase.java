package com.example;

public abstract class TarjetaBase{


    private String color;
    private IJugador jugador;


    public TarjetaBase(String color, IJugador jugadorBoca6) {
        setColor(color);
        setJugador(jugadorBoca6);
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

    private void setJugador(IJugador jugadorBoca6) {
        this.jugador = jugadorBoca6;

           }


   
    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}
