package ru.itis.inf403.lab2_15;

public class Main implements FileReadCompleteListener {
    public static void main(String[] args) {
        new Main().work();
    }

    public void work() {
        Thread2 thread2 = new Thread2(this);
        new Thread(thread2).start();
        while (true) {
            System.out.println("WORK");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void call() {
        System.out.println("File read is completed");
    }
}
