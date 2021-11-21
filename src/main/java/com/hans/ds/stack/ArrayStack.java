package com.hans.ds.stack;

public class ArrayStack<T> implements Stack<T> {

    private T[] data;
    private int stackPointer;

    public ArrayStack() {
        data = (T[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(T t) {
        data[stackPointer++] = t;
    }

    public T pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(T t) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if(data[i].equals(t)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(T t) {
        while (stackPointer > 0) {
            T tmpItem = pop();
            if (tmpItem.equals(t)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find the item on the stack: " + t);
    }

    public int size() {
        return stackPointer;
    }
}
