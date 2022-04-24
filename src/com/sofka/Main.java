package com.sofka;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException, ParseException {

        Controller gameController = new Controller();
        gameController.loadMenu();
    }
}

