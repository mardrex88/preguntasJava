package com.sofka;

import com.sofka.interfaces.IGameManager;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Game implements IGameManager {

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


}
