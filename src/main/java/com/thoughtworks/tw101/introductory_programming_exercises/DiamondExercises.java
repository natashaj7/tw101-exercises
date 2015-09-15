package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        System.out.println("Isosceles triangle exercise:");
        drawAnIsoscelesTriangle(3);
        System.out.println("Diamond exercise:");
        drawADiamond(8);
        System.out.println("Diamond with name exercise:");
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 1; i < (n * 2); i += 2) {
            for (int j = 0; j < (n - i / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        for (int i = 1; i < (n * 2); i += 2) {
            for (int j = 0; j < (n - i / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = (n * 2) - 3; l > 0; l -= 2) {
            for (int m = 0; m < (n - l / 2); m++) {
                System.out.print(" ");
            }
            for (int p = 0; p < l; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i = 1; i < (n * 2) -1; i += 2) {
            for (int j = 0; j < (n - i / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Natasha");
        for (int l = (n * 2) - 3; l > 0; l -= 2) {
            for (int m = 0; m < (n - l / 2); m++) {
                System.out.print(" ");
            }
            for (int p = 0; p < l; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
