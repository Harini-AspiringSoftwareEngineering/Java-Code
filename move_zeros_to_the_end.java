import java.util.*;
import java.lang.*;
import java.io.*;

public class move_zeros_to_the_end {

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

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[res];
                arr[res] = arr[i];
                arr[i] = temp;
                res++;
            }
        }
        // for (int i = res; i < n; i++) {
        // arr[i] = 0;
        // }
        System.out.println("The array which has zeros at the end");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}