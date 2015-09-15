package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by natashaj7 on 15-09-10.
 */
import java.util.Random;

public class NumberGenerator{
    private int number;
    public static final int HIGH = 100;
    public static final int LOW = 1;

    NumberGenerator() {
        Random randomGenerator = new Random();
        number = randomGenerator.nextInt(HIGH) + LOW;
    }

    public boolean guess(int g) {
        if (g > HIGH || g < LOW) { //case that a number out of bounds is picked
            System.out.println("You must pick a number between " + LOW + " and " + HIGH + ", guess again:");
            return true;
        } else if (g < number) {
            System.out.println("Too low, guess again:");
            return true;
        } else if (g > number) {
            System.out.println("Too high, guess again:");
            return true;
        } else if (g == number) {
            System.out.println("You win!");
            return false;
        } else {
            return true;
        }

    }
}
// another class 'validateGuess', split this into another class and have two static classes or do this?
