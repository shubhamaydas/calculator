package com.sample.calculator;

import com.sample.calculator.service.Calculator;

import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter expression");
        String expression = scanner.nextLine();
        Calculator calculator = new Calculator();
        try {
            System.out.println(expression);
            System.out.println("=========Output================");
            System.out.println(calculator.
                    calculate(expression));
            System.out.println("===============================");
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }catch (Exception exception){
            System.out.println("Error in processing");
        }
    }
}

