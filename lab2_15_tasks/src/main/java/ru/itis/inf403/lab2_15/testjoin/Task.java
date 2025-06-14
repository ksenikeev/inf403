package ru.itis.inf403.lab2_15.testjoin;

public class Task extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
