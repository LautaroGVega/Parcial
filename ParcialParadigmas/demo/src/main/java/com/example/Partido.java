package com.example;

import java.util.ArrayList;
import java.util.List;


public class Partido {
    
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String nombre;
    private List<TarjetaBase> tarjetas = new ArrayList<>();
    private Estadio estadio;
    private Arbitro arbitro;
    private List<Arbitro> arbitroLinea = new ArrayList<>(); // 2...2
    private Arbitro arbitroAsistente;


    public Partido(Estadio estadio, Equipo equipoLocal, Equipo equipoVisitante, String nombre) {
        this.estadio = estadio;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.nombre = nombre;
        this.tarjetas = new ArrayList<>();
    }

    public Arbitro getArbitroAsistente() {
        return arbitroAsistente;
    }

    public void setArbitroAsistente(Arbitro arbitroAsistente) {
        this.arbitroAsistente = arbitroAsistente;
    }

    public List<Arbitro> getArbitroLinea() {
        return this.arbitroLinea;
    }

    public void setArbitroLinea(List<Arbitro> arbitroLinea) {
            this.arbitroLinea = arbitroLinea;
    }
 

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
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

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Partido(Estadio pEstadio, Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre, Arbitro arbitro, List<Arbitro> arbitrosLinea, Arbitro arbitroAsistente) {
        setEstadio(pEstadio);
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setName(pNombre);
        setArbitro(arbitro);
        setArbitroLinea(arbitrosLinea);
        setArbitroAsistente(arbitroAsistente);
    }


}
