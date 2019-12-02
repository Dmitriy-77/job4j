package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {

        if (first > second && first > third) {
            return first;
        }
        if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        }
        return first;
    }
}
