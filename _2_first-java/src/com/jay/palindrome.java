package com.jay;
import java.util.Scanner;

// 8. To find out whether the given String is Palindrome or not.
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev = 0;
        int rem = num;

        while(rem > 0){
            int temp = rem%10;
            rev = rev*10 + temp;
            rem /= 10;
        }
        if (rev == num){
            System.out.println("Number is Palindrome Number");
        }else System.out.println("Number is not Palindrome Number");
    }
}
