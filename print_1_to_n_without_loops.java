
import java.util.*;
import java.io.*;

class print_1_to_n_without_loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = sc.nextInt();
        int i = 1;
        System.out.println("Printing numbers from 1 to n");
        print(n, i);
        System.out.println("\nPrinting numbers from n to 1");
        print_reverse(n);
    }

    public static void print(int n, int i) {
        if (n == 0)
            return;

        System.out.print(i + " ");
        i++;
        print(n - 1, i);
    }

    public static void print_reverse(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print_reverse(n - 1);
    }
}