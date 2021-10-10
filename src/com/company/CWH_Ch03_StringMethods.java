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

        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("Par"));
        System.out.println(str.endsWith("ah"));
        System.out.println(str.endsWith("rsh"));

        System.out.println(str.charAt(2));  // this is used to get char at specific index
        System.out.println(str.indexOf("h"));   // this is used to get index of specific char (first occurrence only)

        System.out.println(str.indexOf("ar"));
        System.out.println(str.indexOf("a",3));
        System.out.println(str.indexOf("r",1));

        str = "Harry";

        System.out.println(str.lastIndexOf("r"));
        System.out.println(str.lastIndexOf("r",4));

        System.out.println(str.equals("Harry"));
        System.out.println(str.equals("Harsh"));
        System.out.println(str.equalsIgnoreCase("harry"));

        System.out.println("I \'m Harsh");


    }
}
