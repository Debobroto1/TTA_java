package com.StringPractice;

import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr={100,20,39,30};
        int[] arr2={10,20,39,30,79,11};
        System.out.println("Max in first array: "+findMaxInArray(arr));
        System.out.println("Max in second array: "+findMaxInArray(arr2));
    }
    static int findMaxInArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > max)
                max=a[i];
        }
        return max;
    }
}