import java.util.*;
import java.io.*;

class recursion {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        fun1(n);

    }

    public static void fun1(int n) {
        if (n == 1) {
            return;
        }
        System.out.println("Harini Ravichandran !");
        fun1(n - 1);
    }
}