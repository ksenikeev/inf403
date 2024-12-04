public class Task01 {
    public static void main(String args[]) {
        int[] temp = new int[] {1,2,3,4,5,6,1999bli};
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println(max);
    }
}