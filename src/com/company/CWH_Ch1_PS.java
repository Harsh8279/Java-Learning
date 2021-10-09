package com.company;
import java.util.Scanner;

public class CWH_Ch1_PS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*

//        Q1. Do sum of three numbers
        System.out.println("\n\tSum of Three Numbers\nEnter Number One");
        int a = sc.nextInt();

        System.out.println("Enter number Two ");
        int b = sc.nextInt();

        System.out.println("Enter number Three");
        int c = sc.nextInt();

        int sum = a+b+c;

        System.out.println("Sum of "+a+", "+b+", "+c+" is "+sum);
        */

        /*

//        Q-2. Take out the CGPA of marks.(total marks of subjects is 100)

        System.out.println("\n\tEnter total number of subjects : ");
        int subjectNo = sc.nextInt();

        float sum = 0;
        for(int i=0;i<subjectNo;i++)
        {
            System.out.println("Enter marks of subject"+(i+1));
            float subMark=sc.nextFloat();

            sum+=subMark;
        }

        System.out.println("\n total marks are : "+sum);
        float percentageOutOf100 = sum/subjectNo;

        System.out.println("\n Percentage is : "+percentageOutOf100);

        float cgpaOutOf10 = percentageOutOf100/10;

        System.out.println("\n CGPA is : "+cgpaOutOf10);

        */

        /*

//        Q-3 Ask User for his name and then print Hello <name> , Have a Good Day :)

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("\n\tHello "+name+", Have a Good Day :)");

         */

        /*

//        Q-4 Write a program to convert Kilometers to mile.

        System.out.print("Enter Distance in Km : ");
        float disKm = sc.nextFloat();

//        note :  1km =  0.621371 mile

        double disInMile = disKm*0.621371;

        System.out.println("\n\t"+disKm+" km = "+disInMile+" mile");

         */

//        Q-5 Write A program to check that user Inputed Number is Integer or not?

        System.out.println("\n\t Enter a number ");
//        System.out.println();

        if(sc.hasNextInt()){
            System.out.println("Yes!!! Number is Integer ");
        }
        else {
            System.out.println("No!! Number is not an Integer!!");
        }
    }

}
