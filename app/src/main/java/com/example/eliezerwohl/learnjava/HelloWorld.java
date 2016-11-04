package com.example.eliezerwohl.learnjava;

/**
 * Created by Elie on 11/3/2016.
 */

public class HelloWorld {
    public static void main(String[] args) {

        int lives = 1;
        boolean isGameover = (lives < 0);
        System.out.println(isGameover);

        if (isGameover){
            System.out.println("game over!");
        }
        else {
            System.out.println("you're still alive");
        }
        //psvm is very important
//        String test = "this is a test";
//        System.out.println("hello world " + test + "\n");
//        System.out.println("my first java program");
//        int x = 32;
//        int y = 4;
//        System.out.println(x * y);
//
//        int apples = 6;
//        int oranges = 5;
//        int fruit = apples - oranges;
//        System.out.println(fruit);
//        int weeks = 130;
//        double years = weeks / 52.0;
//        System.out.println(years);
    }
}
