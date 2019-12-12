package ru.job4j.collectionsPro;

import java.util.Iterator;

public class IteratorArray implements Iterator {

    private final int[][] value;
    private int rowIndex = 0;
    private int cellIndex = 0;

    public IteratorArray(int[][] value) {
        this.value = value;
    }

       @Override
       public boolean hasNext() {
           return value.length > rowIndex+1 && value[rowIndex].length >= cellIndex;
       }

       @Override
       public Object next() {
           Object object = null;
           if(value.length > rowIndex && value[rowIndex].length > cellIndex) {
               object = value[rowIndex][cellIndex++];
           }else {
               cellIndex = 0;
               rowIndex++;
               object = value[rowIndex][cellIndex++];
           }
            return object;
       }
}


