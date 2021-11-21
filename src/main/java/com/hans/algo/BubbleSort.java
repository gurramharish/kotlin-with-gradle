package com.hans.algo;

public class BubbleSort<T extends Comparable> {

    public T[] sort(T[] data) {
        boolean again;
        do {
            again = false;
            for(int i = 0; i < data.length; i++) {
                if(data[i-1].compareTo(data[i]) > 0) {
                    T temp = data[i-1];
                    data[i-1] = data[i];
                    data[i] = temp;
                    again = true;
                }
            }

        } while (again);
        return data;
    }

}
