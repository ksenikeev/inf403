public class Task04 {
    public static void main(String args[]) {
        int arrtem[] = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arrtem.length; i++) {
            sum += arrtem[i];
        }
        System.out.println((float)sum / (float) arrtem.length);
    }
}