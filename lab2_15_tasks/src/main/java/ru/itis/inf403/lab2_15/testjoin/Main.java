package ru.itis.inf403.lab2_15.testjoin;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Long ts = System.nanoTime();

        task.join();

        Long te = System.nanoTime();

        System.out.println(te - ts);
    }
}
