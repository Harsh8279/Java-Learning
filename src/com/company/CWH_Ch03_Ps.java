package com.company;
import java.util.Scanner;

public class CWH_Ch03_Ps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        *
        *   Q-1  convert a string into lowercase
        *


        System.out.println("Enter The String : ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        System.out.println(str);
         */

        /*
        *
        *  Q-2 Write a Java Program to replace space with Underscores
        *


        System.out.println("ENter The String : ");
        String str = sc.nextLine();

        str = str.replace(" ","_");

        System.out.println(str);
         */

        /*

        Q-3 Write java program which replace name to user entered name

            letter = "Dear <|name|>, Thanks a Lot!!!"

        String letter = "Dear name, Thanks a lot!!";

        System.out.print("Enter name : ");
        String name = sc.nextLine();

        letter = letter.replace("name",name);

        System.out.println(letter);

        */

        /*
            Q-4 Write a Java Program to detect  double and triple space in a string.
         */

        String str = "Hii  Hello   ";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));



    }
}
