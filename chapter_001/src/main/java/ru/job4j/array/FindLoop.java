package ru.job4j.array;

/**
 * КЛАССИЧЕСКИЙ ПОИСК ПЕРЕБОРОМ
 * У нас задан массив элементов. Нам необходимо найти индекс элемента, удовлетворяющего условию.
 * Решение этой задачи сводится в последовательному перебору каждого элемента
 * Если элемент подходит под условие, мы останавливаем цикл и возвращаем индекс нашего элемента.
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}