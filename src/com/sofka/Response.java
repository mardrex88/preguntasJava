package com.sofka;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Response {

    private String response;
    private String isTrue;

    public Response(String response, String isTrue) {
        this.response = response;
        this.isTrue = isTrue;
    }

    public Response() {

    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(String isTrue) {
        this.isTrue = isTrue;
    }

    public List<Response> toList(JSONArray json){
        List <Response> responses = new ArrayList<>();

        for (int i = 0; i < json.size(); i++) {

            JSONObject resuesta = (JSONObject) json.get(i);
            Response responseAux = new Response();
            responseAux.response= resuesta.get("response").toString();
            responseAux.isTrue = resuesta.get("is_true").toString();
            responses.add(responseAux);
        }

        return responses;

    }

}
