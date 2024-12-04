public class Task06 {
    public static void main(String args[]) {
        int[] kamil = {4, 65, -6, 11, 2, 5};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < kamil.length; i++) {
            if ((i + 1) % 2 == 0) {
                even += kamil[i];
            } else {
                odd += kamil[i];
            }
        }
        System.out.println(even - odd);
    }
}