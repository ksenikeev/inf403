package ru.itis.inf403.lab2_13;

public class Integral {

    private static int N;
    private static double integral = 0;

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
        public PartSummCalculate(double a, double b) {
            this.a = a; this.b = b;
        }
        public void run() {
            double result = partSum(a, b, N);
            integral += result;
        }
    }
}
