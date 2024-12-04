public class Task9 {
    public static void main (String[] args) {
        int mas[] = {1,4,5,7};
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] > i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}