// 6. Maximum Element in Array
// Q: Find the maximum element in an array.

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 5, 15, 3};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
