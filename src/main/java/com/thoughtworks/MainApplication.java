package com.thoughtworks;

import java.util.List;
import java.util.Scanner;

/**
 * @program: tdd-fizzbuzzwhizz-java
 * @description: 启动类
 * @author: liust
 * @create: 2018-04-10 16:01
 **/
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Let's play FizzBuzzWhizz Game!\nPlease input three special numbers which are smaller than 10, divided by comma.");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] inputNumbers = number.split(",");
        FizzBuzzGame game = new FizzBuzzGame(Integer.parseInt(inputNumbers[0]),
                Integer.parseInt(inputNumbers[1]),
                Integer.parseInt(inputNumbers[2]));
        System.out.println("Please input the total student number\n");
        game.start(scanner.nextInt());
        List<String> results = game.getResults();
        System.out.println(results.toString());
    }
}
