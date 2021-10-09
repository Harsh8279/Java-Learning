package com.company;
import java.util.Scanner;

public class CWH_05_UserInput {

    public static void main(String[] args) {
        System.out.println("Taking Input From User");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int a =  sc.nextInt();
        System.out.println("Enter Number 2 : ");
        float b = sc.nextFloat();
        System.out.println("Enter Number 3 : ");
        double c = sc.nextDouble();
        System.out.println("Enter String : ");
        String d = sc.next();
        sc.nextLine();      // clear the stream if not then sc.next() content will automatically fall in to our variable without asking us
        System.out.println("Enter String : ");
        String e = sc.nextLine();

        System.out.print("\na is : ");
        System.out.println(a);
        System.out.print("\nb is : ");
        System.out.println(b);
        System.out.print("\nc is : ");
        System.out.println(c);
        System.out.print("\nd is : ");
        System.out.println(d);
        System.out.print("\ne is : ");
        System.out.println(e);


    }

}
