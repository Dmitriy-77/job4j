package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static void main(String[] args) {
        double result = distance(4, 1, 7, 3);
        System.out.println("result (4, 1) to (7, 3) " + result);

        double result1 = distance(12, 15, 15, 18);
        System.out.println("result (12, 15) to (15, 18) " + result1);
    }
}
