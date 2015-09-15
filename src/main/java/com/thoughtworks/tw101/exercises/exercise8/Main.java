package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userGuess;

        System.out.println("I have a number between " + NumberGenerator.LOW +" and "+ NumberGenerator.HIGH+ ", can you guess what it is:");
        Scanner a = new Scanner(System.in);
        Guess isRight = new Guess(NumberGenerator.generateRandom()); //call NumberGenerator to create a random number and pass it in the Guess constructor

        while (a.hasNext()) {
            userGuess=a.nextLine();
            if(ValidateGuess.validate(userGuess)){  // catch any NumberFormatExceptions
                isRight.guess(Integer.parseInt(userGuess));
            }
        }
    }
}
//Assumption: generates random integers between 1 and 100
