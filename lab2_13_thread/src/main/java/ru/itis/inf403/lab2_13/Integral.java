package ru.itis.inf403.lab2_13;

import java.util.function.Consumer;

public class Integral implements Consumer<Double>{

    private static int N;
    private volatile double integral = 0;

    public synchronized void accept(Double d) {
        integral += d;
    }

    public static void main(String[] args) throws InterruptedException {
        // [1, 3]
        Integral integralObject = new Integral();
        int countProc = Runtime.getRuntime().availableProcessors();
        N = 10000 / countProc; // количество "столбиков" для суммирования задачей
        double h = (3. - 1.) / countProc; // ширина интервала для обсчета каждым потоком
        Thread[] threads = new Thread[countProc];
        for (int i = 0; i < countProc; ++i) {
            threads[i] =
                    new Thread(new PartSummCalculate(1 + i * h, 1 + (i + 1) * h, integralObject));
            threads[i].start();
        }

        for (int i = 0; i < countProc; ++i) {
            threads[i].join();
        }

        System.out.println(integralObject.integral);
    }

    public static double func(double x) {
        return Math.exp(- x * x /2) * Math.sin(x);
    }

    // частичная сумма, расчитываемая одним потоком
    public static double partSum(double a, double b, int N) {
        double h = (b - a) / N;
        double sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += h * (func(a + h * i) + func(a + h * (i + 1))) / 2;
        }
        return sum;
    }

    static class PartSummCalculate implements Runnable {
        private double a;
        private double b;
        private Consumer<Double> consumer;
        public PartSummCalculate(double a, double b, Consumer<Double> consumer) {
            this.a = a; this.b = b; this.consumer = consumer;
        }
        public void run() {
            double result = partSum(a, b, N);
            consumer.accept(result);
        }
    }
}
