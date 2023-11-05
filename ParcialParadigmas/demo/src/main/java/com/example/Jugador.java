package com.example;

public class Jugador implements IJugador, IImprimible{
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
    @Override
    public String impresion() {
        // "[Jugador 6] Marcos Rojo > Defensor"
        return String.format("[Jugador %d] %s > %s",
                getNumero(),
                getName(),
                getPosicion());
    }
}
