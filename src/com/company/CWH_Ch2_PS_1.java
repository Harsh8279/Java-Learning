package com.company;
import java.util.Scanner;
public class CWH_Ch2_PS_1 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        /*
        *      what is the output of the following expression
        *      float a = 7/4*9/2
        *      1.2*9/2
        *      10.8/2
        *      5.4
        * */

        float a = 7/4.0f*9/2.0f;

        System.out.println("a is : "+a);

        /*
        *   write a java program to encrypt the grade by adding 8 to it.Decrypt it to show the correct grade.
        *
        * */

        char grade = 'C';
        //encrypt the grade
        grade = (char) (grade + 8);

        System.out.println("Grade is "+grade);

        //decrypt

        grade = (char)(grade - 8);

        System.out.println("Original grade is "+grade);

        /*
        *   Use comparison operators to find out whether a given number is greater than the user entered numbered or not
        *
        * */

        /*

        float givenNumber = 75.86f;

        System.out.println("\nEnter Number for comparison ");
        float userNumber = sc.nextFloat();

        boolean ans = givenNumber>userNumber;

        System.out.println(ans);

        */

        /*
        *   write the following expression in a java program
        *   v2-u2/2cS
        *
        * */
        float v = 5.0f;
        float u = 4.0f;
        float c = 5.0f;
        float S = 4.5f;
        float formula  = ((v*v) - (u*u))/2*c*S ;

        System.out.println(formula);

        /*
        *   find the value of the following expression :
        *   int x = 7;
        *   int a = 7 * 49 / 7 + 35 / 7;
        * */

        int x = 7;
        int abc = 7 * 49 / 7 + 35 / 7;

        System.out.println("Ans is  : "+abc);
    }

}
