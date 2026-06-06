// 2. Out of Bound Error
// Q: What happens if you access an index outside the array size?
// Concept: Accessing beyond size-1 → ArrayIndexOutOfBoundsException.
public class OutOfBoundDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]); // invalid (size=5 → last index=4)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
