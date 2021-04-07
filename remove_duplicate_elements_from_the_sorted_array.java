import java.util.*;
import java.lang.*;
import java.io.*;

public class remove_duplicate_elements_from_the_sorted_array {

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

        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        System.out.println("Duplicates removed array : ");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("The size of the updated array " + res);

    }
}