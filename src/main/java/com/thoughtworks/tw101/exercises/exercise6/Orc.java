package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by natashaj7 on 15-09-08.
 */
public class Orc implements Monster {

    static final int INITIALHITPOINTS=20;
    static final String NAME= "Orc";
    private int currentHitpoints;

    public Orc(){
        currentHitpoints=INITIALHITPOINTS;
    }

    public void takeDamage(int amount){
        currentHitpoints-=amount;
    }

    public void reportStatus(){
        System.out.println("Monster Name: " + NAME + ", Current hitpoints:" + currentHitpoints );
    }
}