import java.util.*;
import java.io.*;
import java.lang.*;

public class array_rotation {
    public static void main(String args[]) {
        System.out.println("This is an example of array rotation by k elements in the left side/ counter clock-wise");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n;
        n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the number of elements that you want to rotate in left");
        int k;
        k = sc.nextInt();

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}