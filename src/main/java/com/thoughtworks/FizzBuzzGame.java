package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private static int FizzNumber = 3;
    private static int BuzzNumber = 5;
    private static int WhizzNumber = 7;

    private static final String RESULTFIZZ = "Fizz";
    private static final String RESULTBUZZ = "Buzz";
    private static final String RESULTWHIZZ = "Whizz";

    private List<String> results = new ArrayList<>();

    public FizzBuzzGame(int FizzNumber, int BuzzNumber, int WhizzNumber) {
        this.FizzNumber = FizzNumber;
        this.BuzzNumber = BuzzNumber;
        this.WhizzNumber = WhizzNumber;
    }

    public FizzBuzzGame() {

    }

    public String translate(int number) {
        if (String.valueOf(number).indexOf("3") != -1)
            return RESULTFIZZ;
        if (number % FizzNumber == 0 || number % BuzzNumber == 0 || number % WhizzNumber == 0)
            return HandleTranslationForMultipleCases(number);
        return new Integer(number).toString();
    }

    private String HandleTranslationForMultipleCases(int number) {
        String output = "";
        if (number % FizzNumber == 0)
            output += RESULTFIZZ;
        if (number % BuzzNumber == 0)
            output += RESULTBUZZ;
        if (number % WhizzNumber == 0)
            output += RESULTWHIZZ;
        return output;
    }

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(translate(i));
        }
    }
    public List<String> getResults() {
        return results;
    }
}


