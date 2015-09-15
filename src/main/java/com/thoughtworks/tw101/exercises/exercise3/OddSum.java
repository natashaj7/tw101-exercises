package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    private int first, last, sum;

    public OddSum() {
        sum = 0;
    }

    public int of(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
