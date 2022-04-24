package com.sofka;

import java.util.ArrayList;
import java.util.Collections;

public class PositionTable {
    public static ArrayList<Gamer> gamerList = new ArrayList<>();

    public PositionTable(){
        gamerList.add(new Gamer("Julian"));
        gamerList.add(new Gamer("Jhon"));
        gamerList.add(new Gamer("Julieth"));
    }
    public static void addGamer(Gamer gamer){
        gamerList.add(gamer);
    }

    public void printTable() {
        Collections.sort(gamerList, (o1, o2) -> o1.getPoints().compareTo(o2.getPoints()));
        for (int i = gamerList.size()-1; i >=0 ; i--) {
            System.out.println(gamerList.get(i).toString());
        }
    }
}

