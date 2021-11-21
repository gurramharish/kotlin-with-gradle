package com.hans.ds.queues;

public class QueueCheck {

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        System.out.println("Length :: " + a.length);
        int front = 10;
        int end = 10;
        System.out.println((end + 1) % a.length);
    }
}
