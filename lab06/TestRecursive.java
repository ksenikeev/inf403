public class TestRecursive {
    public static void main(String[] args) {
        // 1, 2, 3, ... N
        // Найти сумму арифметической прогрессии
        // SUM(N) = SUM(N-1) + N

        //int s = sum(4);
        //System.out.println(s);
        for(int i = 0; i < 2000; i++) {
            System.out.println(i + " " + ((char) i));
        }
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return sum(n - 1) + n;
    }
    /*
       sum(4)
         sum(3) + 4
           sum(2) + 3
             sum(1) + 2
     */

}