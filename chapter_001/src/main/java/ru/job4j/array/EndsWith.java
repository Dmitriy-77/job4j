package ru.job4j.array;

/**
 * СЛОВО ЗАКАНЧИВАЕТСЯ С ...
 * В JDK есть класс String. В нем есть метод endsWith. Этот метод проверяет, что слово заканчивается c определенной последовательности.
 * Например.
 * Привет - вет > true
 * Привет - вит > false.
 * В этом задании вам нужно будет написать свой аналогичный метод.
 * Давайте создадим каркас класса и напишем сразу тесты.
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int longWord = word.length-1;
        for(int i = post.length-1; 0 < i; i--) {
            if(post[i] == word[longWord]) {
                result = true;
                longWord--;
            }else result = false;
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }


}
