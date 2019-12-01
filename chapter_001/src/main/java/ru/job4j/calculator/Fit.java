package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100)*115;
    }


    public static double womanWeight(double height) {
        return (height - 110)*115;
    }

    public static void main(String[] args) {
        double man = manWeight(179);
        System.out.println("Man 179 is " + man);

        double woman = womanWeight(170);
        System.out.println("Woman 170 is " + woman);
    }
}
