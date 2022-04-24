package com.sofka;

import com.sofka.interfaces.IMenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller implements IMenu {

    PositionTable positionTable = new PositionTable();

    //implementación de interface para cargar menu principal
    @Override
    public void loadMenu() {

        Scanner readOption = new Scanner(System.in);
        String[] options = {"1-  Jugar", "2 - Tabla de Posiciones", "3 - Agregar Preguntas", "4 - Salir del juego\n"};

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
                    viewTable();
                    break;
                case 3:
                    new PreguntaController().addNewQuestion();
                    break;
                case 4:
                    break;
            }

        }
    }

    public void createNewGame() {
        Scanner readUser = new Scanner(System.in);
        System.out.println("Ingrese el nombre de Jugador");
        String namePlayer;
        String message = "";
        namePlayer = readUser.nextLine();
        Game game = new Game(namePlayer);
        Registro registro = new Registro(namePlayer);

        for (int i = 1; i <= 5; i++) { // controla las rondas, o niveles o categorias

            int response = 0;
            Question questionByLevel = registro.getCurrentQuestionRandom(i);

            System.out.println(questionByLevel.getStatement().concat("?"));

            List<Response> aleatorResponse = new ArrayList<Response>(questionByLevel.responses());
            Collections.shuffle(aleatorResponse);

            for (int j = 1; j <= aleatorResponse.size(); j++) {
                System.out.println(j + ". " + aleatorResponse.get(j - 1).getResponse());
                if (aleatorResponse.get(j - 1).getIsTrue().equals("1")) {
                    response = j;
                }
            }
            System.out.println("Ingrese la opcion de respuesta");
            System.out.println("5. Salir");

            int option;
            option = Integer.parseInt(readUser.nextLine());

            if (option == 5) {
                message += "Has terminado la partida";
                break;
            }
            if (option != response) {
                //System.out.println("");
                message += "Respuesta incorrecta, finalizaste el juego";
                break;
            }
            if (i == 5) {
                message += "Felicidades ganaste";

            }
            registro.setPoints(i * 5);
            registro.setMaxLevel(i);


        }
        registro.setFecha(LocalDate.now());
        System.out.println(message + "Hoy " + registro.getFecha().toString() + "Obtuviste  " + registro.getPoints() + " Puntos");
        PositionTable.addGamer(registro.gamer());
    }

    private void viewTable() {
        positionTable.printTable();

    }
}
