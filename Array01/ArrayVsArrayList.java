// 3. Difference Between Array and ArrayList
// Q: What is the difference between arrays and ArrayLists in Java?

// Array → Fixed size.

// ArrayList → Dynamic size.

import java.util.*;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Fixed size array
        int[] arr = new int[5];
        arr[0] = 10;

        // Dynamic ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("Array element: " + arr[0]);
        System.out.println("ArrayList elements: " + list);
    }
}
