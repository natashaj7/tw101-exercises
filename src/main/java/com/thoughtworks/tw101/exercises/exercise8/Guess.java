package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by natashaj7 on 15-09-14.
 */
public class Guess {

    private int correctNumber;
    private ArrayList <Integer> guessList;

    Guess(int num){
        correctNumber=num;
        guessList=new ArrayList<>();
    }
    public boolean guess(int g) {
        saveGuess(g);
        if (g > NumberGenerator.HIGH || g < NumberGenerator.LOW) { //case that a number out of bounds is picked
            System.out.println("You must pick a number between " + NumberGenerator.LOW + " and " + NumberGenerator.HIGH + ", guess again:");
            return true;
        } else if (g < correctNumber) {
            System.out.println("Too low, guess again:");
            return true;
        } else if (g > correctNumber) {
            System.out.println("Too high, guess again:");
            return true;
        } else if (g == correctNumber) {
            System.out.println("You guessed correctly!");
            printGuesses();
            return false;
        } else {
            return true;
        }
    }
    public void saveGuess(int g){
        guessList.add(g);
    }
    public void printGuesses(){
        System.out.println("Here is a list of all the numbers you guessed:");
        for(int individualGuess:guessList){
            System.out.println(individualGuess);
    }
}}
