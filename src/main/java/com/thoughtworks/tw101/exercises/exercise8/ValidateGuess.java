package com.thoughtworks.tw101.exercises.exercise8;

public class ValidateGuess {

    public static int uGuess;
    public static boolean validate(String guess){
        try{
            uGuess= Integer.parseInt(guess);
            return true;
        }
        catch (NumberFormatException e){
            System.out.println("Your guess needs to be a number between " + NumberGenerator.LOW +" and "+ NumberGenerator.HIGH+ ". Please enter your guess");
            return false;
        }
    }
}
