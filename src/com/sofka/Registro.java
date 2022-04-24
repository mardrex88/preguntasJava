package com.sofka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Registro extends Game{

    private LocalDate fecha;
    public static ArrayList<Gamer> gamerList = new ArrayList<>();
    public Registro(String namePlayer) {

        super(namePlayer);
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
