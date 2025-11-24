package cat1;//import java.util.Scanner;
//
//public class cat1.CRT {
//
//    // Euclidean GCD
//    public static int gcd(int a, int b) {
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter No.of Equations: ");
//        int n = sc.nextInt();
//
//        int[] a = new int[n]; // remainders
//        int[] m = new int[n]; // moduli
//        int M = 1;            // product of all moduli
//
//        // Input equations
//        System.out.println("Enter each equation in the form: remainder modulus");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            m[i] = sc.nextInt();
//            System.out.println("Equation " + (i + 1) + ": x ≡ " + a[i] + " (mod " + m[i] + ")");
//            M *= m[i];
//        }
//
//        System.out.println("Product of all moduli (M) = " + M);
//
//        // Validation: remainder < modulus and pairwise coprime moduli
//        for (int i = 0; i < n; i++) {
//            if (a[i] >= m[i]) {
//                System.out.println("❌ No Solution (remainder >= modulus for equation " + (i + 1) + ")");
//                return;
//            }
//            for (int j = i + 1; j < n; j++) {
//                if (gcd(m[i], m[j]) != 1) {
//                    System.out.println("❌ No Solution (moduli not coprime: " + m[i] + " and " + m[j] + ")");
//                    return;
//                }
//            }
//        }
//
//        int z = 0;
//
//        // cat1.CRT formula
//        for (int i = 0; i < n; i++) {
//            int K = M / m[i];
//            System.out.println("\nFor equation " + (i + 1) + ": x ≡ " + a[i] + " (mod " + m[i] + ")");
//            System.out.println("K = M / m[" + i + "] = " + K);
//
//            int y = 0;
//
//            // Brute-force modular inverse of K mod m[i]
//            for (int j = 1; j < m[i]; j++) {
//                if ((K * j) % m[i] == 1) {
//                    y = j;
//                    break;
//                }
//            }
//            System.out.println("Modular inverse of " + K + " mod " + m[i] + " is y = " + y);
//
//            int contribution = a[i] * K * y;
//            System.out.println("Contribution to solution = " + a[i] + " * " + K + " * " + y + " = " + contribution);
//
//            z += contribution;
//        }
//
//        // Final solution
//        int solution = z % M;
//        System.out.println("\n✅ Final Solution: x ≡ " + solution + " (mod " + M + ")");
//
//        sc.close();
//    }
//}
import java.util.*;

public class CRT {

    // Chinese Remainder Theorem Function
    static int CRT(int remainders[], int moduli[], int count, int productOfModuli) {
        int result = 0;

        for (int i = 0; i < count; i++) {
            int Mi = productOfModuli / moduli[i];  // partial product (excluding current modulus)
            int inverse = 0;

            // Find modular inverse of Mi under moduli[i]
            for (int j = 1; j < moduli[i]; j++) {
                if ((Mi * j) % moduli[i] == 1) {
                    inverse = j;
                    break;
                }
            }

            // Contribution from this congruence
            result += remainders[i] * Mi * inverse;
        }

        return result % productOfModuli;  // Final smallest solution
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of congruence relations: ");
        int count = sc.nextInt();

        int remainders[] = new int[count];
        System.out.println("Enter the remainders (a[i]): ");
        for (int i = 0; i < count; i++) {
            remainders[i] = sc.nextInt();
        }

        int moduli[] = new int[count];
        int productOfModuli = 1;
        System.out.println("Enter the moduli (m[i]): ");
        for (int i = 0; i < count; i++) {
            moduli[i] = sc.nextInt();
            productOfModuli *= moduli[i];
        }

        int solution = CRT(remainders, moduli, count, productOfModuli);
        System.out.println("The solution is: " + solution);

        sc.close();
    }
}
