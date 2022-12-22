package com.jay;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // take input from user till user press x/X
        int ans = 0;
        while (true){
            System.out.println("Please enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' | op == '*' | op == '/' || op == '%'){
                System.out.println("Please enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }

            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Op");
            }
            System.out.println("Answer is : " + ans);
         }

    }
}
