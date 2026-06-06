// 5. Sum of Elements in Array
// Q: Write a program to calculate the sum of all elements in an array.
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
