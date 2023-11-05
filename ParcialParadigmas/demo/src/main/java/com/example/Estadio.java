package com.example;

public class Estadio implements IImprimible{
private String nombre;
private String ciudad;
private String pais;

	public Estadio(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    
    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

   
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }

   
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return nombre + ", " + ciudad + " (" + pais + ")";
    }
    
    public String impresion() {
        // "[Estadio] La Bombonera (Buenos Aires - Argentina)"
        return String.format("[Estadio] %s (%s - %s)",
                getName(),
                getCiudad(),
                getPais());
    }
}
