package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by natashaj7 on 15-09-14.
 */
public class NumberGenerator {

    public static final int HIGH = 100;
    public static final int LOW = 1;

    public static int generateRandom(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(HIGH) + LOW;
    }
}
