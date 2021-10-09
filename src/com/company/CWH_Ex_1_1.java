package com.company;
import java.util.Scanner;
public class CWH_Ex_1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Subject No : ");
        int n = sc.nextInt();
        System.out.println("Enter Total Marks : ");
        int marks = sc.nextInt();

        int sum = 0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Subject "+(i+1)+" Marks");
            int sMarks = sc.nextInt();

            sum+=sMarks;
        }

        System.out.println("Total marks of student is : "+sum);

        float percentage = sum*100/(n*marks);

        System.out.println("Percentage of Student is : "+percentage);

    }
}
