package com.jay;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        int num = 45532354;

        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if (rem == 5){
                count++;
            }
            num /= 10;
        }
        System.out.println("The Number of 5 in this is : " + count);

    }
}
