import java.util.*;
import java.io.*;
import java.lang.*;

public class is_sorted_array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n;
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Checking whether the given array is sorted");
        boolean ans = issorted(arr, n);
        if (ans == true) {
            System.out.println("The given array is sorted");
        } else {
            System.out.println("The given array is not sorted");
        }

    }

    public static boolean issorted(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}