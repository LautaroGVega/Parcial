package com.example;

import java.util.List;


public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar;
    private Arbitro arbitro;
    private List<Arbitro> arbitros;

    public Var(Partido partido) {
        this.partido = partido;
    }
    
    public List<AVAR> getaVar() {
        return aVar;
    }

    public void setaVar(List<AVAR> aVar) {
        if (this.aVar.size() == 3) {
            this.aVar = aVar;
        } else {
            throw new IllegalArgumentException("aVar list must contain exactly 3 items.");
        }
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return asistenteDeVideo;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }
    
    public int cantidadTarjetas(Equipo pEquipo){
        List<IJugador> jugadores = pEquipo.getJugadores();
        List<TarjetaBase> tarjetas = this.partido.getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> jugadores.contains(tarjeta.getJugador())).
                count();
    }

    public int cantidadTarjetasRojas() {
        int cont = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaRoja) {
                cont++;
            }
        }
        return cont;
    }

    
    public int cantidadTarjetasAmarillas() {
        int cont = 0;
        List<TarjetaBase> tarjetas = partido.getTarjetas();
        for (TarjetaBase tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaAmarilla) {
                cont++;
            }
        }
        return cont;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitroLinea(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }
    
    public List<Arbitro> getArbitroLinea() {
        return arbitros;
    }



}

