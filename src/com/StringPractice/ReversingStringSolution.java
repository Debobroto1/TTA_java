package com.StringPractice;

import javax.swing.*;
import java.util.Scanner;

public class ReversingStringSolution {
    public static void main(String[] args) {
        String str="debo";
        performReverseString(str);
    }
    static String performReverseString(String s){
        String reverseString="";
        for (int i=s.length()-1;i>=0;i--){
            reverseString=reverseString+s.charAt(i);
        }
        System.out.println(reverseString);
        return reverseString;
    }



}
