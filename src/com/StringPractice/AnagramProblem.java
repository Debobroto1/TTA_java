package com.StringPractice;

import java.util.Arrays;

public class AnagramProblem {
    public static void main(String[] args) {
        System.out.println(isAnagram("aab", "baa"));
        System.out.println(isAnagram("aab", "ba a"));
        System.out.println(isAnagram("acc", "123"));

    }


    static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        if (s1.length() != s2.length())
            return false;

        else {
            char str1[] = s1.toLowerCase().toCharArray();
            Arrays.sort(str1);
            char str2[] = s2.toLowerCase().toCharArray();
            Arrays.sort(str2);


            if (Arrays.equals(str1, str2) == true) {
                return true;
            } else
                return false;


        }

    }
}
