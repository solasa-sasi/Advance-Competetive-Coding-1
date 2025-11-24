package cat1;

import java.util.Scanner;

public class SimpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) prime[i] = true;   // assume all prime

        for (int p = 2; p * p <= n; p++)                // check up to √n
            if (prime[p])
                for (int i = p * p; i <= n; i += p)     // mark multiples false
                    prime[i] = false;

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++)
            if (prime[i]) System.out.print(i + " ");

        sc.close();
    }
}
