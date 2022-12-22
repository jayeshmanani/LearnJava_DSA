package com.jay;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int iter = 2;
        int sum = 0;
        while(iter <= num){
                sum = a + b;
                a = b;
                b = sum;
                iter ++;
        }
        System.out.println(sum);
    }

}
