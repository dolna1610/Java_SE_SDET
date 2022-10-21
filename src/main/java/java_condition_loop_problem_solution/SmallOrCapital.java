// 1. Write a program to check if inputted letter is small or capital.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class SmallOrCapital {
    public SmallOrCapital() {
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            char letter = sc.next().charAt(0);
            if (Character.isLetter(letter)) {
                if (letter >= 'A' && letter <= 'Z') {
                    System.out.println("This is a Capital letter");
                } else {
                    System.out.println("This is a small letter");
                }
            } else {
                System.out.println("The input is not a letter! Give valid input");
            }
        } catch (Exception var3) {
            System.out.println("Give valid letter as an input!");
        }

    }

    public static void alternativeSolve(char letter) {
        if (Character.isLetter(letter)) {
            if (Character.isUpperCase(letter)) {
                System.out.println("This is a Capital letter");
            } else {
                System.out.println("This is a small letter");
            }
        }

    }
}

