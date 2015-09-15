package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    private float average;

    public float averageArea(Rectangle[] rectangles) {
        for (int i=0;i<rectangles.length;i++){
            average+=rectangles[i].area();
        }
        return average=average/rectangles.length;
    }
}
