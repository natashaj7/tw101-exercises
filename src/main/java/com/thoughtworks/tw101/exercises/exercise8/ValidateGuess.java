package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by natashaj7 on 15-09-14.
 */
public class ValidateGuess {

    public static boolean validate(String guess){
        try{
            Integer.parseInt(guess);
            return true;
        }
        catch (NumberFormatException e){
            System.out.println("Your guess needs to be a number. Please enter your guess");
            return false;
        }
    }
}
