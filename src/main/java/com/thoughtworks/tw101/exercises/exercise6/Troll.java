package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    static final int INITIALHITPOINTS = 40;
    static final String NAME = "Troll";
    private int currentHitpoints;


    public Troll() {
        currentHitpoints = INITIALHITPOINTS;
    }

    public void takeDamage(int amount) {
        currentHitpoints -= (amount/2);
    }

    public void reportStatus() {
        System.out.println("Monster Name: " + NAME + ", Current hitpoints:" + currentHitpoints);
    }
}
