package ru.itis.inf403.lab2_13.graph;

public class Graph {

    public static final int SPEED = 1000;

    public static final int[][] matrix = {
            { 0,5,11,7,0, 0, 0, 0, 0,0,0}, // из 1
            { 5,0, 0,4,0, 3, 7, 0, 0,0,0},
            {11,0, 0,0,8, 0, 0, 0, 0,0,0},
            { 7,4, 0,0,5, 0, 0, 9, 0,0,0},
            { 0,0, 8,5,0, 0, 0, 6, 0,7,0},
            { 0,3, 0,0,0, 0, 0,12, 8,0,0},
            { 0,7, 0,0,0, 0, 0, 0,11,0,0},
            { 0,0, 0,9,6,12, 0, 0, 0,0,9},
            { 0,0, 0,0,0, 8,11, 0, 0,0,2},
            { 0,0, 0,0,7, 0, 0, 0, 0,0,3},
            { 0,0, 0,0,0, 0, 0, 9, 2,3,0}
    };

    private static boolean[] comandI = new boolean[11];
    private static boolean[] comandII = new boolean[11];

    public static synchronized boolean getComandI(int n) {
        return comandI[n];
    }

    public static synchronized boolean getComandII(int n) {
        return comandII[n];
    }

    public static synchronized void setComandI(int n) {
        comandI[n] = true;
    }

    public static synchronized void setComandII(int n) {
        comandII[n] = true;
    }

    public static synchronized boolean readAndWriteI(int n) {
        if (!comandI[n]) {
            comandI[n] = true;
            return true;
        } else {
            return false;
        }
    }
}
