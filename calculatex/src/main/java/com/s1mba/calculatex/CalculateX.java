package com.s1mba.calculatex;

public class CalculateX {
    private int value;

    public CalculateX(int v) {
        value = v;
    }

    public void add(int a) {
        value += a * 10;
    }

    public void multiply(int a) {
        value *= a * a;
    }
}
