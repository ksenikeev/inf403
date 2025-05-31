package ru.itis.inf403.lab2_13.graph;

public class TaskI implements Runnable {
    @Override
    public void run() {
        int vertex = 0;
        try {
            while (true) {
                for (int i = 0; i < 11; ++i) {
                    if (Graph.matrix[vertex][i] != 0 && Graph.readAndWriteI(i)) {
                        Thread.sleep(Graph.matrix[vertex][i] * Graph.SPEED);
                        vertex = i;
                        break;
                    }
                    // ищем кратчайший путь до нее (дейкстра)

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
