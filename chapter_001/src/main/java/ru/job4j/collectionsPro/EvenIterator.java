package ru.job4j.collectionsPro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator<Integer> implements Iterator{

    private final int[] value;
    int index = 0;

    public EvenIterator(int[] value) {
        this.value = value;
    }


    @Override
    public boolean hasNext() {
        for(int i = index; i < value.length; i++) {
            if(value[i]%2 == 0) {
                index = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() throws NoSuchElementException {
        if(!hasNext()) {
            throw  new NoSuchElementException();
        }
        return value[index++];
    }
}
