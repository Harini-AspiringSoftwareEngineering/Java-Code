import java.util.*;
import java.lang.*;
import java.io.*;

public class Second_largest_in_the_array {

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
        int ans = second_largest(arr, n);
        System.out.println("The index of the second largest element in the given array is " + ans);

    }

    public static int second_largest(int arr[], int n) {
        int res = -1, largest = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
                res = largest;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return res;
    }
}
