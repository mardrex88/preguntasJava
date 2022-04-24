package com.sofka;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException, ParseException {

        Controller gameController = new Controller();
        gameController.loadMenu();
    }
}

