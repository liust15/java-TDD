package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private static final int FIZZ3=3;
    private static final int BUZZ5=5;
    private static final int WHIZZ7=7;

    private static final String RESULTFIZZ="Fizz";
    private static final String RESULTBUZZ="Buzz";
    private static final String RESULTWHIZZ="Whizz";

    private List<String> results = new ArrayList<>();
    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            if (getFizz(i)) {
                results.add(RESULTFIZZ);
            } else {
                if (i % FIZZ3 == 0 || i % BUZZ5 == 0 || i % WHIZZ7 == 0) {
                    results.add(FizzBuzzWhizz(i, FIZZ3, RESULTFIZZ) + FizzBuzzWhizz(i, BUZZ5, RESULTBUZZ) + FizzBuzzWhizz(i, WHIZZ7, RESULTWHIZZ));
                } else {
                    results.add(String.valueOf(i));
                }

            }
        }
    }

    public Boolean getFizz(int i) {
        if (String.valueOf(i).indexOf("3") == -1) {
            return false;
        }
        return true;

    }

    public String FizzBuzzWhizz(int i, int element, String result) {
        if (i % element == 0) {
            return result;
        }
        return "";
    }


    public List<String> getResults() {
        return results;
    }
}


