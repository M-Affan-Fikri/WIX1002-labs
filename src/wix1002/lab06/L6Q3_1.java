package wix1002.lab06;
import java.util.*;

public class L6Q3_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000); // Generating multi-digit numbers (0 - 9999)
            System.out.print(arr[i] + " ");
        }
        
        reverse(arr);
        
        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reversed = 0;
            
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            
            arr[i] = reversed; // Update the element in the array
        }
    }
}