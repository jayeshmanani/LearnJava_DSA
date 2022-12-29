package com.jay;

import java.util.Scanner;

// 6. Input currency in rupees and output in USD.
public class inr_to_usd {
    public static void main(String[] args) {
        System.out.println("Please enter the amount in INR");
        Scanner in = new Scanner(System.in);
        float inr = in.nextLong();
        System.out.println("The amount of "+ inr + " is equal to "+ (inr/80) + " USD");
    }
}
