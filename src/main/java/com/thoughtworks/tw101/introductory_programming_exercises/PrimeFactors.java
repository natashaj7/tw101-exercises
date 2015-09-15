package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Input number to attain prime factors:");
        Scanner a = new Scanner(System.in);
        while(a.hasNextInt()) {
            List<Integer> primeFactors = generate(a.nextInt());
            printFactors(primeFactors);
        }
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new LinkedList<>();
        for(int i=2;i<=n;i++){
            while(n%i==0){
                primeFactors.add(i);
                n/=i;
            }
        }
        return primeFactors;
    }
    private static void printFactors(List<Integer> factorsList){
        for(int allFactors:factorsList) {
        System.out.println(allFactors);
    }
    }
}
