package ru.itis.inf403.lab2_15;

public class Thread2 implements Runnable{
    private FileReadCompleteListener callBack;

    public Thread2(FileReadCompleteListener callBack) {
        this.callBack = callBack;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        callBack.call();
    }
}
