package com.martinez;

public class Main {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);
    }
}
