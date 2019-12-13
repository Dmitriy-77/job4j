package ru.job4j.array;

/**
 * МАССИВ ЗАПОЛНЕН TRUE или FALSE
 * Метод должен проверить, что все элементы в массиве являются или true или false.
 *
 * Решение задачи сводится к проверки всех элементов с эталонным. Эталонным можно взять любой элемент в массиве. Лучше взять элемент с индексом 0.
 *
 * Например.
 * {true, true, true} - вернет true; массив однородный, он заполнен true.
 * {true, false, true} - вернет false; массив не однородный, он заполнен и true и false.
 * {false, false, false} - вернет true; массив однородный, он заполнен false.
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;

          for (int i = 0; i < data.length; i++) {
              if(data[0] == data[i]) {
                  result = true;
              } else {
                  result = false;
                  break;}
          }
        return result;
    }
}