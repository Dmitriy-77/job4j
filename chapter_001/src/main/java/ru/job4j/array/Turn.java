package ru.job4j.array;

/**
 * Перевернуть массив с чётным и нечётным кол-вом элементов
 */
public class Turn {
    public int[] back(int[] array) {
        int index = array.length-1;
        int temp;
        for (int i = 0;i < array.length/2;i++) {
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            index--;
        }
        return array;
    }
}