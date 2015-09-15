package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by natashaj7 on 15-09-08.
 */
public interface Monster {

    public void takeDamage(int amount);

    public void reportStatus();
}

// Would this not be better as an abstract class that could have currentHitpoints as a field and takeDamage
// as an implemented method and reportStatus could be abstract?