public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int value = 4;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("элемент найден");
        } else {
            System.out.println("элемент не найден");
        }
    }
}