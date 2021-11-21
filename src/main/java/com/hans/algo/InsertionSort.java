package com.hans.algo;

public class InsertionSort<T extends Comparable> {

    public T[] sort(T[] data) {
        for(int i = 1; i < data.length; i++) {
            if(data[i].compareTo(data[i - 1]) < 0) {
                for(int p = i; p > 0; p--) {
                    if(data[p].compareTo(data[p - 1]) < 0) {
                        T temp = data[p];
                        data[p] = data[p-1];
                        data[p-1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        return data;
    }
}
