package com.example;

public class Jugador implements iJugador{
    private String name;
    private int numero;
    private String value;

    public Jugador(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
         this.numero = numero;
    }

	
	public String getPosicion() {
		return value;
	}

	
	public void setPosicion(String value) {
        this.value = value;
    }
    
}
