package org.campus02.calculator;

public class Calculator {


    public static void main(String[] args) {
        int resultAdd = add(2,2);
        System.out.println("resultAdd = " + resultAdd);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int mult(int a, int b) {
        int result = a * b;
        return result;
    }
}
