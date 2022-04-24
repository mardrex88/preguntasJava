package com.sofka;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class PreguntaController {

    public void addNewQuestion() {
        Question question = new Question();
        Scanner read = new Scanner(System.in);
        Response response = new Response();
        List<Question> dataQuestions;

        System.out.println("Por favor ingrese el numero de una categoria");
        System.out.println("1 - Facil");
        System.out.println("2 - Normal");
        System.out.println("3 - Dificil");
        System.out.println("4 - Profesional");
        System.out.println("5 - Leyenda");

        question.setCategory(Integer.parseInt(read.nextLine()));

        System.out.println("Por favor ingrese en enunciado de la Pregunta");
        question.Statement(read.nextLine());
        System.out.println("Ingrese la respuesta Verdadera");
        response = new Response(read.nextLine(), "1");
        question.responses().add(response);
        System.out.println("Ingrese la respuesta falsa");
        response = new Response(read.nextLine(), "0");
        question.responses().add(response);
        System.out.println("Ingrese la respuesta falsa");
        response = new Response(read.nextLine(), "0");
        question.responses().add(response);
        System.out.println("Ingrese la respuesta falsa");
        response = new Response(read.nextLine(), "0");
        question.responses().add(response);

        dataQuestions = new Game().chargerQuestions();
        dataQuestions.add(question);
        System.out.println(dataQuestions.toString());

       try {
            FileWriter reade = new FileWriter("questions.json");
            reade.write(dataQuestions.toString());
            reade.flush();
            System.out.println(dataQuestions.stream().toArray().toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
