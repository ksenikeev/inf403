public class Task03 {
    public static void main (String args[]) {
        int arr[] = new int[] {1,3,4,-6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}