package com.StringPractice;

public class StringSubstringSolution {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(printSubString(3,7,str));
        }
        static String printSubString(int i,int j,String s){
        s=removeSpaceFromString(s);
        String subStr=s.substring(i,j);
        return subStr;
        }
        static String removeSpaceFromString(String s){
        String noSpaceStr=s.replaceAll("\\s","");
        return noSpaceStr;
    }





}
