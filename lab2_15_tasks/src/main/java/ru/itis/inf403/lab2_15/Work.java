package ru.itis.inf403.lab2_15;

import java.util.Set;

public class Work extends Thread {
    private Set<Work> dependencies;

    // constructor

    public void run() {
        for (Work w : dependencies) {
            //w.join(); // ждем завершения работы предыдущих работ
        }
        // работаем
    }
}
