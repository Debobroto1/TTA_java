package com.Day3.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter your number and check if it is even or odd");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput % 2 == 0)
            System.out.println("This is a even number");
        else
            System.out.println("This is a odd number");
    }
}

