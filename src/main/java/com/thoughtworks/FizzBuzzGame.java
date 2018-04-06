package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            if (getFizz(i)) {
                results.add("Fizz");
            } else {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    results.add(FizzBuzzWhizz(i, 3, "Fizz") + FizzBuzzWhizz(i, 5, "Buzz") + FizzBuzzWhizz(i, 7, "Whizz"));
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


