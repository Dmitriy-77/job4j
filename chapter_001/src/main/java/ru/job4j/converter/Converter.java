package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test reasult : " + passedEuro);

        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 2. Test result : " + passedDollar);

        int inRuble_euro = 4;
        int expected_Ruble_euro = 280;
        int out_Ruble_euro = euroToRuble(inRuble_euro);
        boolean passed_Ruble_euro = expected_Ruble_euro == out_Ruble_euro;
        System.out.println("4 euros are 280. Test result : " + passed_Ruble_euro);

        int inRuble_dollar = 5;
        int expected_Ruble_dollar = 300;
        int out_Ruble_dollar = dollarToRuble(inRuble_dollar);
        boolean passed_Ruble_dollar = expected_Ruble_dollar == out_Ruble_dollar;
        System.out.println("5 dollars are 300. Test result : " + passed_Ruble_dollar);
    }
}
