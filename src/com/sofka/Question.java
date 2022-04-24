package com.sofka;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String statement;
    private List<Response> responses;
    private Integer category;

    private String labelCategory;

    public Question(String statement, List<Response> responses, String category) {
        this.statement = statement;
        this.responses = new ArrayList<>();
        this.category = Integer.parseInt(category);
    }

    public Question() {
        this.responses = new ArrayList<>();
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public void Statement(String statement) {
        this.statement = statement;
    }

    public void Responses(List<Response> responses) {
        this.responses = responses;
    }

    public void Category(Integer category) {
        this.category = category;
    }

    public void LabelCategory(String labelCategory) {
        this.labelCategory = labelCategory;
    }

    public List<Response> responses(){
        return this.responses;
    }

    public int category(){
        return this.category;
    }

    public String getStatement() {
        return statement;
    }

    public List<Question> toList(JSONArray json){
        List <Question> questions = new ArrayList<>();

        for (int i = 0; i < json.size(); i++) {

            JSONObject object = (JSONObject) json.get(i);
            JSONArray responses = (JSONArray) object.get("responses");

            Question questionAux = new Question();
            questionAux.category = Integer.parseInt(object.get("category_id").toString());
            questionAux.statement = object.get("statement").toString();
            questionAux.responses = new Response().toList(responses);
            questions.add(questionAux);
        }
        return questions;

    }

    @Override
    public String toString() {
        return "{ \n" +
                "\"category_id\" : \""+category+"\",\n"+
                "\"statement\" : \""+statement+"\",\n"+
                "\"labelCategory\" : \""+labelCategory+"\",\n"+
                "\"responses\" : "+responses+"\n"+
                "}\n" ;
    }
}
