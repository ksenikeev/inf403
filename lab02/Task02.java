public class Task02 {
    public static void main(String[] args) {
        int[] x = {1,43,21,6,4,0};
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println(min);
    }
}