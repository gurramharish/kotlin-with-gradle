package com.hans.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {

    private List<T> data;
    private int stackPointer;

    public ListStack() {
        data = new ArrayList<>(1000);
    }

    @Override
    public void push(T t) {
        data.add(stackPointer, t);
        stackPointer = data.size();
    }

    @Override
    public T pop() {
        return data.get(--stackPointer);
    }

    @Override
    public boolean contains(T t) {
        return data.contains(t);
    }

    @Override
    public T access(T t) {
        while (stackPointer > 0) {
            T temp = data.remove(--stackPointer);
            if(temp != null && temp.equals(t)) {
                return temp;
            }
        }
        throw new IllegalArgumentException("Could not find the item on the stack: " + t);
    }

    @Override
    public int size() {
        return data.size();
    }
}
