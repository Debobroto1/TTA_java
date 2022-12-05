package com.Day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a mathematical operator<+,-,*,/>: ");
        char operator=sc.next().charAt(0);
        System.out.println("Enter first number:");
        int firstNum=sc.nextInt();
        System.out.println("Enter second number");
        int secondNum=sc.nextInt();
        switch(operator) {
            case 1:
                performAddition(firstNum,secondNum);
                break;
            case 2:
                performSubstraction(firstNum,secondNum);
                break;
            case 3:
                performDivision(firstNum,secondNum);
                break;
            case 4:
                performMultiplication(firstNum,secondNum);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    //Method for addition
    public static void performAddition ( int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
    //Method for subtraction
    public static void performSubstraction ( int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
    }
    //Method for multiplication
    public static void performMultiplication ( int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }
    //Method for division
    public static void performDivision ( int num1, int num2){
        try {
            int result = num1 / num2;
        }
        catch (ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
    }
}
