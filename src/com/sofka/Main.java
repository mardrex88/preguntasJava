package com.sofka;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] opciones = {"1. Jugar", "2. Tabla de Posiciones", "3. Configuracion de Preguntas", "4- Exit"};
        Scanner readOption = new Scanner(System.in);
        int option = 0;

        System.out.println("Bienvenido a la TRIVIA");
        System.out.println("Ingrese una opción:");

        option = Integer.parseInt(readOption.nextLine());


        switch (option){
            case 1 :
                // Ir a crear el Usuario
                System.out.println("Ingrese el nombre de Jugador");
                String namePlayer;
                namePlayer = readOption.nextLine();
                Game game = new Game(namePlayer);

                for (int i = 1; i < 6; i++) {


                  //  Question currentQuestion  = game.getRandomQuestion(i);
                }
                

                break;
            case 2 :
                // Iremos a ver la lista de Jugadores
                break;
            case 3 :
                // Lista de preguntas
                break;
            default:
                //volver a mostrar el menu
                break;
        }
    }
    }

