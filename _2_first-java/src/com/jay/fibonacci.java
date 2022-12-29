package com.jay;

import java.util.Scanner;

// 7. To calculate Fibonacci Series up to n numbers.
public class fibonacci {
    public static void main(String[] args){
        System.out.println("Please enter the number to print the Fibonacci Series");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        long a = 0;
        long b = 1;
        int iter = 2;
        System.out.printf("%s ", a);
        System.out.printf("%s ", b);
        while(iter < num){
            long next = a + b;
            a = b;
            b = next;
            iter ++;
            System.out.printf("%s ", next);
        }
    }
}
