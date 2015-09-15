package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberGenerator randomNumber = new NumberGenerator();
        System.out.println("I have a number between " + NumberGenerator.LOW +" and "+ NumberGenerator.HIGH+ ", can you guess what it is:");
        Scanner a = new Scanner(System.in);
        while (a.hasNext()) {
            if (a.hasNextInt()){
                randomNumber.guess(Integer.parseInt(a.nextLine()));
            }
            else {
                System.out.println("Your guess needs to be a number. Please enter your guess");
                a.nextLine();
            }
        }
    }
}
//Assumption: generates random integers between 1 and 100