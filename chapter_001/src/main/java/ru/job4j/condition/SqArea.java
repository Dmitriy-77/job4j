package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {

        int x = 1; // x - всегда 1 в уровнении
        int h = ( (p/2) / (k+x) ); //вычисляем высоту
        int l = (h*k); // вычисляем длинну
        return h*l; //вычисляем и возвращаем площадь
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        double result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);

    }
}
