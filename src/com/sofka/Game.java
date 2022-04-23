package com.sofka;

import com.sofka.interfaces.IGameManager;
import com.sofka.interfaces.IMenu;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Game implements IMenu, IGameManager {

    private String namePlayer;
    private Integer points;
    private Integer maxLevel;
    private boolean abandoned;
    private List<Question> dataQuestions;


    public Game(String namePlayer) {
        this.namePlayer = namePlayer;
        this.points = 0;
        this.maxLevel = 0;
        this.abandoned = false;
        this.dataQuestions = chargerQuestions();
    }

    @Override
    public List<Question> chargerQuestions() {
        JSONParser parser = new JSONParser();
        try {
            Reader reade = new FileReader("questions.json");
            Object obj = parser.parse(reade);
            dataQuestions = (JSONArray) obj;
            System.out.println(dataQuestions);

        } catch (ParseException pe) {
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataQuestions;
    }

    @Override
    public List<Question> getQuestionsByLevel(int level, List<Question> dataQuestions) {
        List<Question> questionsByCategory = new ArrayList<>();
        for (int i = 0; i < dataQuestions.size(); i++) {

        }
        return dataQuestions;
    }

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
