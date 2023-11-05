package com.example;

public abstract class ArbitroBase {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArbitroBase(String name){
        setName(name);
    }
}