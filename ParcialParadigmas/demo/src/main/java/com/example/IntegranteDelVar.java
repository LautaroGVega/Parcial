package com.example;

public abstract class IntegranteDelVar extends ArbitroBase{
    
    public IntegranteDelVar(String name) {
        super(name);
    }

    private String TipoAsistente;

    public String getTipoAsistente() {
        return TipoAsistente;
    }

    public void setTipoAsistente(String tipoAsistente) {
        TipoAsistente = tipoAsistente;
    }
}