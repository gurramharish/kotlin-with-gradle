package com.hans.ds.queues;

public class BasicQueue<T> {

    private T[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (T[]) new Object[size];
        front = -1;
        end = -1;
    }

    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        }
        return end - front + 1;
    }

    public void enQueue(T t) {
        if(size() == data.length) {
            throw new IllegalStateException("Queue is full!");
        } else if(size() == 0) {
            front++;
        }
        data[end++] = t;
    }

    public T deQueue() {
        T temp = null;
        if (size() == 0) {
            throw new IllegalStateException("No more items in Queue");
        } else if(front == end) {
            temp = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            temp = data[front];
            data[front] = null;
            front++;
        }
        return data[front++];
    }
}
