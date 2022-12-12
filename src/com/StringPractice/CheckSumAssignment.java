package com.StringPractice;

public class CheckSumAssignment {
    public static void main(String[] args) {
        System.out.println("the check value "+checksum(100,0));
    }
    static int checksum(int one,int two){
        int check;
        int sum=one+two;
        if(sum<100) {
            check = 0;
        } else if (sum>100) {
            check=1;
        }else {
            check = 2;//if(sum==100)
        }
        return check;
    }
}
