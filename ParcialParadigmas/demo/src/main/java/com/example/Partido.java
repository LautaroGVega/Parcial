package com.example;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String nombre;
    private List<Tarjeta> tarjetas;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.nombre = nombre;
        this.tarjetas = new ArrayList<>();
    }

    public String getName() {
        return nombre + " " + equipoLocal.getAbreviatura() + "x" + equipoVisitante.getAbreviatura();
    }
    
 
    public void setName(String nombre) {
            this.nombre = nombre;
    }

    public void agregar(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad() {
        return tarjetas.size();
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

}
