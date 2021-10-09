package com.company;
import java.util.Scanner;
public class CWH_Ch03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = new String("Harsh");

        System.out.println(name);

//        String is Class but we can use as a datatype
        String str = "Harsh";
        System.out.println(str);

        System.out.printf("%s",str);
        System.out.format("%s",str);
        System.out.format(str);

        System.out.println("Enter your name : ");
        String userName = sc.nextLine();

        System.out.println("Hi "+userName+" Have a Good Day!!!");
    }

}
