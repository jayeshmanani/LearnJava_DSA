package com.jay;

import java.util.Scanner;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class simple_calculator {
    public static void main(String[] args) {
        System.out.println("This is simple Calculator");
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter 1st Number :");
        float num1 = in.nextFloat();
        System.out.println("Please Enter 2nd Number :");
        float num2 = in.nextFloat();
        System.out.println("Please Enter Operation :");
        char op = in.next().trim().charAt(0);
        float res = 0;
        if(op == '+'){
            res = num1 + num2;
        } else if(op == '-'){
            res = num1 - num2;
        } else if (op == '*') {
            res = num1 * num2;
        } else if (op == '/') {
            res = num1/num2;
        } else if (op == '%') {
            res = num1%num2;
        } else System.out.println("Invalid Operation, Please enter the valid one!");

        System.out.println("Final result is : "+ res);

    }
}
