package com.martinez;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] numbers = new int[2][3][5];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
