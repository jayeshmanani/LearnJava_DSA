package com.jay;

import java.util.Scanner;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class simple_interest {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator:");
        System.out.println("");
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter the Principal Amount (P) : ");
        float principal = in.nextFloat();
        System.out.println("Please Enter the Rate of Interest (R) : ");
        float rate = in.nextFloat();
        System.out.println("Please Enter the Number of Years (T): ");
        float num_years = in.nextFloat();
        float interest = (principal * (rate/100) * num_years);
        System.out.println("Your Simple Interest would be :" + interest);
        System.out.println("Total Amount to be Paid would be :" + (principal + interest));

    }
}

