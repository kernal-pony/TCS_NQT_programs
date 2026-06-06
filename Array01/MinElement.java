// 7. Minimum Element in Array
// Q: Find the minimum element in an array.
public class MinElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 5, 15, 3};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
