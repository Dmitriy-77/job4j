package ru.job4j.collectionsPro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator<Integer> implements Iterator{

    private final int[] value;
    int index = 0;

    public EvenNumbersIterator(int[] value) {
        this.value = value;
    }


    @Override
    public boolean hasNext() {
        for(int i = index; i < value.length; i++) {
            if(value[i]%2 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() throws NoSuchElementException {
        Object object = null;
        for (int i = index; i < value.length; i++) {
            if (value[index] % 2 == 0) {
                object = value[index++];
                break;
            } else index++;
              object = new NoSuchElementException("Нет больше элементов");
        }
        return object;
    }

    public static void main(String[] args) {

        Iterator it = new EvenNumbersIterator(new int[]{1, 2, 3, 4, 5, 6, 7});


        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
    }
}
