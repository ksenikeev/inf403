package ru.itis.inf403.lab2_10;

import java.lang.module.FindException;
import java.util.Arrays;

public class MathUtil {
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * @return >0, a>b; 0, a=b; <0, a<b
     */
    public static int compare(int a, int b) {
/*
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
*/

        return a - b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws IllegalArgumentException
     */
    public static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0)
            throw new IllegalArgumentException("Знаменатель не 0!");
        return a / b;
    }

    public int[] sort(int[] array) {
        // сортировка
        return array;
    }
}
