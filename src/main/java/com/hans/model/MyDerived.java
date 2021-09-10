package com.hans.model;

public class MyDerived extends MyBase {

    @Override
    int getValue() { return 10; }

    public static void main(String[] args) {
        MyBase var = new MyDerived();
        System.out.println(var.getValue());
    }
}
