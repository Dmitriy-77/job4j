package ru.job4j.array;

/**
 * СЛОВО НАЧИНАЕТСЯ С...
 * Метод принимает два массива символов. Вам нужно в цикле for c индексом сравнить значения ячеек с одинаковым индексом.
 * Если все ячейки из массива pref соответствуют таким же ячейкам в массива word значит нужно вернуть true.
 * Если хотя бы один элемент отличается, значит слово word не начинается со слова pref.
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for(int i = 0; i < pref.length; i++) {
            if(pref[i] == word[i]) {
                result = true;
            } else result = false;
        }
        return result;
    }
}
