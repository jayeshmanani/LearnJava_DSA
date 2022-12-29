package com.jay;

import java.util.Scanner;

// 5. Take 2 numbers as input and print the largest number.
public class largest_num {
    public static void main(String[] args) {
        System.out.println("Please enter the two numbers: ");
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter 1st Number :");
        float num1 = in.nextFloat();
        System.out.println("Please Enter 2nd Number");
        float num2 = in.nextFloat();

        if(num1 > num2 && num1 != num2){
            System.out.println("Number 1: "+ num1 + " is largest than Number 2 : " + num2);
        } else if (num1 == num2) {
            System.out.println("Both Numbers are Equal: "+ num1);
        } else System.out.println("Number 2: "+ num2 + " is largest than Number 1 : " + num1);

    }
}
