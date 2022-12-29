package com.jay;

import java.util.Scanner;

// 1. Write a program to print whether a number is even or odd, also take input from the user.
public class even_odd {
    public static void main(String[] args) {
        System.out.println("Program will tell you if the Number entered is Odd or Even?");
        System.out.println("Please enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Number " + num + " is Even Number");
        }
        else System.out.println("Number " + num + " is Odd Number");

    }
}
