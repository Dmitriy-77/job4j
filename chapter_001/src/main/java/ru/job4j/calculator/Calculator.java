/**
 * Calculator
 * @author Dmitriy Dmitriev
 * version 1.0
 * sience 06.12.2019
 *
 */

package ru.job4j.calculator;

public class Calculator {
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * main
     * @param args
     * @author 1.0
     *
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4,2);
        multiply(2,1);
        subtrack(10,5);
        subtrack(9,4);
    }
}
