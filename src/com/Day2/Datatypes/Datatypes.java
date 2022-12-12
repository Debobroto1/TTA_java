package com.Day2.Datatypes;

import java.sql.SQLOutput;

public class Datatypes {
    public static void main(String[] args) {
        double x=83.0;
        double y=62.0;
        double z=2.0;
        System.out.println((10-4)+3*4);
        System.out.println(Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println((2+3)-10*5  );

        String name ="debo";
        String name1="debo";
        System.out.println(name==name1);
        String str="abcde";
        System.out.println(str.substring(1,3));
        String s1=new String("TTA");
        String s2=new String("TTA");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

}
