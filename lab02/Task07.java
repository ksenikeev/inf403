import java.util.Arrays;

class Task07 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = arrayOne.length + arrayTwo.length;
        int[] allArray = new int[length];

        for (int i = 0; i<length; i++ ) {
            if (i < arrayOne.length) {
                allArray[i] = arrayOne[i];
            } else {
                allArray[i] = arrayTwo[i-arrayOne.length];
            }
        }
        System.out.println(Arrays.toString(allArray));
    }
}