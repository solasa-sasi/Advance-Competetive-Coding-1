package cat1;
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
