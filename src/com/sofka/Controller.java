package com.sofka;

import com.sofka.interfaces.IMenu;

import java.util.List;
import java.util.Scanner;

public class Controller implements IMenu {

    //implementación de interface para cargar menu principal
    @Override
    public void loadMenu() {
        Scanner readOption = new Scanner(System.in);
        String[] options = {"1-  Jugar", "2 - Tabla de Posiciones", "3 - Configuracion de Preguntas", "4 - Salir del juego\n"};

        System.out.println("Bienvenido a la TRIVIA\n");
        System.out.println("Ingrese una opción:");

        int option = 0;
        while (option != 4) {
            printMenu(options);
            option = readOption.nextInt();
            switch (option) {
                case 1:
                    createNewGame();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }
    }

    //metodo creación de nuevo juego
    public void createNewGame(){
        Scanner readUser = new Scanner(System.in);
        System.out.println("Ingrese el nombre de Jugador");
        String namePlayer;
        namePlayer = readUser.nextLine();
        Game game = new Game(namePlayer);

        for (int i = 1; i <= 5; i++) {

            Question questionByLevel =  game.getCurrentQuestionRandom(i);
            System.out.println(questionByLevel);

        }

        //game.loadMenu();
    }
}
