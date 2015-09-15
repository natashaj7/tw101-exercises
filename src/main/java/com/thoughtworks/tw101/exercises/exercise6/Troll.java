package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by natashaj7 on 15-09-08.
 */
public class Troll implements Monster {

    static final int INITIALHITPOINTS = 40;
    static final String NAME = "Troll";
    private int currentHitpoints;


    public Troll() {
        currentHitpoints = INITIALHITPOINTS;
    }

    public void takeDamage(int amount) {
        currentHitpoints -= amount;
    }

    public void reportStatus() {
        System.out.println("Monster Name: " + NAME + ", Current hitpoints:" + currentHitpoints);
    }
}
