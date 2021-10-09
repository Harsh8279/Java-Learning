package com.company;

public class CWH_Increrment_Decrement {
    public static void main(String[] args) {
        System.out.println("Increment and Decrement");
        int i = 35;
        System.out.println("i "+i);
        System.out.println("i++ "+(i++));
        System.out.println("i "+i);
        System.out.println("++i "+(++i));
        System.out.println("i "+i);

        int j = 49;

        System.out.println("j "+j);
        System.out.println("j-- "+(j--));
        System.out.println("j "+j);
        System.out.println("--j "+(--j));
        System.out.println("j "+j);

        /*
        *   Guess the output of the following code
        *   int y=7;
        *   int x = ++y * 8;
        *   System.out.println(x);
        * */

        int y=7;
        int x = ++y * 8;
        System.out.println(x);

//        Increment operator on char
        char a = 'H';

        System.out.println(a++);
        System.out.println(a);
    }
}
