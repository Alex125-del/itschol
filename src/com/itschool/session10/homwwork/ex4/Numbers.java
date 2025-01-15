package com.itschool.session10.homwwork.ex4;

import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {

        int[] numbers = {5, 8, 4, 7, 1, 2, 6, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}