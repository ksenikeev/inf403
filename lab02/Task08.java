public class Task08 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = new int[input.length / 3];
        int n = 0;
        for (int i = 0; i < input.length; i++) {
            if ((i+1)%3 == 0) {
                result[n] = input[i];
                n += 1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}