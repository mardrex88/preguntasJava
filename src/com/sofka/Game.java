package com.sofka;

import com.sofka.interfaces.IMenu;

import java.util.Scanner;

public class Game implements IMenu {

    private String namePlayer;

    public Game(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    //implementación de interface para cargar menu de juego
    @Override
    public void loadMenu() {
        Scanner readOption = new Scanner(System.in);
        boolean continueGame = true;
        String[] questionInfo = {"question", "1 - answer", "2 - answer", "3 - answer", "4 - answerTrue"};

        int answerSelected = 0;
        while (continueGame){
            System.out.println("\n");
            printMenu(questionInfo);
            answerSelected = readOption.nextInt();
            switch (answerSelected) {
                case 1:
                    continueGame = false;
                    break;
                case 2:
                    continueGame = false;
                    break;
                case 3:
                    continueGame = false;
                    break;
                case 4:
                    //continueGame
                    break;
                default:
                    System.out.println("Elige una opción valida");
                    break;
            }
        }
    }

}
