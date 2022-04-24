package com.sofka.interfaces;

import com.sofka.Question;

import java.util.List;

public interface IGameManager {

    public List<Question> chargerQuestions();
    public List<Question> getQuestionsByLevel(int level);
}
