package com.sofka;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String statement;
    private List<Response> responses;
    private Integer category;
    private String labelCategory;

    public Question(String statement, List<Response> responses, Integer category) {
        this.statement = statement;
        this.responses = new ArrayList<>();
        this.category = category;
    }

    public List<Response> responses(){
        return this.responses;
    }

}
