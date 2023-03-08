package com.javastart.wrappers;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;

        Integer firstNumber = 10;
        Integer secondNumber = Integer.valueOf(15);

        System.out.println(a == b);
        System.out.println(firstNumber == secondNumber);

        System.out.println(firstNumber.equals(secondNumber));
    }
}
