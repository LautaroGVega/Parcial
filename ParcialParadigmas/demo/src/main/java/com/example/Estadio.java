package com.example;

public class Estadio {
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

    // Setter para el nombre del torneo
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Setter para el nombre del torneo
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }

    // Setter para el nombre del torneo
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return nombre + ", " + ciudad + " (" + pais + ")";
    }
}
