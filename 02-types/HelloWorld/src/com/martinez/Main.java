package com.martinez;

public class Main {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
    }
}
