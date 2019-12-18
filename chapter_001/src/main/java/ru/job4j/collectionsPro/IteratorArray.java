package ru.job4j.collectionsPro;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
           if (!hasNext()) {
               throw new NoSuchElementException();
           } if(value.length > rowIndex && value[rowIndex].length > cellIndex) {
               return value[rowIndex][cellIndex++];
           }else cellIndex = 0;
                 rowIndex++;
                 return value[rowIndex][cellIndex++];
       }

}



