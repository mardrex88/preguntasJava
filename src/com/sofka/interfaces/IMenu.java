package com.sofka.interfaces;

public interface IMenu {

    void loadMenu();

    default void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Elige una opción : ");
    }

}
