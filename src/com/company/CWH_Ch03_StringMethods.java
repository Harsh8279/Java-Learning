package com.company;
import java.util.Scanner;
public class CWH_Ch03_StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ") ;
        String name = sc.nextLine();
        int len = name.length();
        System.out.println(len);
        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);
        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);
        String trimmedStringName = name.trim();     // remove spaces from start and end
        System.out.println(trimmedStringName);
        System.out.println(name);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        String str = "Harsh";
        System.out.println(str.replace("r","d"));
        System.out.println(str.replace("rsh","aa"));
        System.out.println(str.replace("r","hi"));



    }
}
