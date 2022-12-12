package com.StringPractice;

public class AnagramProblem2 {
    public static void main(String[] args) {

        System.out.println(isAnagram("abc","efg"));


    }
    static boolean isAnagram(String s1,String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i) - 'a';
            arr[index]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i] !=0){
                return false;
            }
        }
        return true;
    }
}
