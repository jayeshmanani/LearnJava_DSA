package com.jay;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.println("Please enter 2nd Number");
        int num2 = in.nextInt();

        System.out.printf("following are the Armstrong Number between %s and %s are: ", num1, num2);
        for (int digit=num1; digit<=num2; digit++){
            int no_of_digits = 0;
            int sum = 0;

            int temp = digit;
            while(temp > 0){
                temp/=10;
                no_of_digits++;
            }

            temp = digit;
            while (temp > 0){
                int ein_digit = temp % 10;
                sum += Math.pow(ein_digit, no_of_digits);
                temp /= 10;
            }

            if(sum == digit){
                System.out.printf(" %s ",digit);
            }

        }

    }
}
