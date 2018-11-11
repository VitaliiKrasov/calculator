package com.soft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static String echo(String s) {return "You are " + s; };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first integer");
        String first = br.readLine();
        int a = Integer.parseInt(first);

        System.out.println("Enter second integer, not zero");
        String second = br.readLine();
        int b = Integer.parseInt(second);

        System.out.println("Sum is " + add(a, b));
        System.out.println("Difference is " + subtract(a, b));
        System.out.println("Multiplying is " + multiply(a, b));
        System.out.println("Dividend is " + divide(a, b));

        System.out.println("\nHow are you?");
        String third = br.readLine();
        System.out.println(echo(third));
    }
}

