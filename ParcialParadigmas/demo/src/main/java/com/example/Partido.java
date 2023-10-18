package com.example;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String nombre;
    private List<TarjetaBase> tarjetas;
    private Estadio estadio;

    public Partido(Estadio estadio, Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        this.estadio = estadio;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.nombre = nombre;
        this.tarjetas = new ArrayList<>();
    }
    
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getName() {
        return nombre + " " + equipoLocal.getAbreviatura() + "x" + equipoVisitante.getAbreviatura();
    }
    
 
    public void setName(String nombre) {
            this.nombre = nombre;
    }

    public void agregar(TarjetaBase tarjeta) {
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad() {
        return tarjetas.size();
    }

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }

    public Object getEstadio() {
        return estadio;
    }

}
