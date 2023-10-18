package com.example;
import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    private List<Equipo> equipos;
    private List<Partido> partidos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }
       
    public String getNombre() {
            return nombre;
    }
    
      
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public void agregar(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregar(Partido partido) {
        partidos.add(partido);
    }

    public int equiposCantidad() {
        return equipos.size();
    }

    public int partidosCantidad() {
        return partidos.size();
    }
}
