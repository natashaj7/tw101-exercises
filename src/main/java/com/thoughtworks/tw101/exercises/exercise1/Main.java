package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        final int UPPERLIMIT=100;
        int sum=0;

        for (int i=1; i<=UPPERLIMIT; i++){
          if (i%2!=0){
              System.out.print(i+" ");
              sum+=i;
          }
      }
        System.out.println("Sum: "+sum);
    }
}
