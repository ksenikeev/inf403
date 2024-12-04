public class Task05 {
    public static void main(String[] args) {
        long[] a = {1, 6, 4, 7, 2};
        long pr = 1;
        for (int i = 0; (i < a.length); i++) {
            pr *= (long) a[i];
        }
        System.out.println(pr);
    }
}