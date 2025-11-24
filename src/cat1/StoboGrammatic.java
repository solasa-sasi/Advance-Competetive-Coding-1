package cat1;

import java.util.Scanner;

public class StoboGrammatic {
    public static boolean isStrobogrammatic(String num) {

        for (int l = 0, r = num.length() - 1; l <= r; l++, r--) {
            char c1 = num.charAt(l), c2 = num.charAt(r);
            if (!((c1 == '0' && c2 == '0') ||
                    (c1 == '1' && c2 == '1') ||
                    (c1 == '6' && c2 == '9') ||
                    (c1 == '9' && c2 == '6') ||
                    (c1 == '8' && c2 == '8')))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();   // Read user input as string

        if (isStrobogrammatic(num))
            System.out.println(num + " is a Strobogrammatic Number.");
        else
            System.out.println(num + " is NOT a Strobogrammatic Number.");

        sc.close();
    }
}
