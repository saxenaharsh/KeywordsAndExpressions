package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //a mile is equal to 1.609344

        double kiloMeter = (100 * 1.609344);
        System.out.println("100 Mile is equal to " + kiloMeter + " Kilometers");

        int highScore = 50;

        if(highScore == 50){
            System.out.println("This is an expression");
        }

        //Challenge problem
        int score = 100;
        if(score > 90){
            System.out.println("YOu got the high score!");
            score = 0;

            System.out.println("score = 100 is an expression");
            System.out.println("score > 90 is an expression");
            System.out.println("score = 0 is an expression");
            System.out.println("You got the high Score! is also an expression");
        }

    }
}
