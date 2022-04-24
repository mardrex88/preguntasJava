package com.sofka;

public class Gamer {
    private String name;
    private Integer points;

    public Gamer(String name){
        this.name = name;
        this.points = 0;
    }

    public Integer getPoints() {
        return points;
    }

    public void pints(Integer points){
        this.points = points;
    }

    @Override
    public String toString() {
        return  "Jugador= '" + name + '\'' +
                ", Puntos= " + points ;
    }
}

