package com.jay;
import java.time.*;
import java.util.Scanner;

// 2. Take name as input and print a greeting message for that particular name.
public class greet_on_time {
    public static void main(String[] args) {
        System.out.println("Please enter your name : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        LocalTime time1 = LocalTime.now();
        String greeting = "";
        if (time1.isBefore(LocalTime.parse("12:00:00")) && time1.isAfter(LocalTime.parse("06:00:00"))){
            greeting = "Good Morning";
        } else if (time1.isAfter(LocalTime.parse("12:00:00")) && time1.isBefore(LocalTime.parse("16:00:00"))) {
            greeting = "Good Noon";
        } else if (time1.isAfter(LocalTime.parse("16:00:00")) && time1.isBefore(LocalTime.parse("19:00:00"))) {
            greeting = "Good Evening";
        } else greeting = "Good Night";
        System.out.println("Hello, " + greeting + " : " + name);
    }
}
