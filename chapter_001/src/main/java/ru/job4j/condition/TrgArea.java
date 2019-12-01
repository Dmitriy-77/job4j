package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a+b+c)/2; // вычисляем полуперимент
        return Math.sqrt(p*(p-a)*(p-b)*(p-c)); //вычисляем и возвращаем площадь треугольника по формуле Герона
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
