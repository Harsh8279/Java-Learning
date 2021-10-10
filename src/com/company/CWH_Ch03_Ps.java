package com.company;
import java.util.Scanner;

public class CWH_Ch03_Ps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        *
        *   Q-1  convert a string into lowercase
        *
        * */

        System.out.println("Enter The String : ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        System.out.println(str);


    }
}
