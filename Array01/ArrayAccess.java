// 1. Accessing Elements in an Array
// Q: How do you access elements in an array using indices?
// Concept: Arrays use 0-based indexing. Access is from 0 to size-1.

public class ArrayAccess {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 5, 15, 3};
        System.out.println("First element: " + arr[0]);   // 2
        System.out.println("Last element: " + arr[arr.length - 1]); // 3
    }
}

