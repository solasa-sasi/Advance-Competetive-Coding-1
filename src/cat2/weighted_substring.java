
package cat2;

import java.util.HashSet;
import java.util.Scanner;

public class weighted_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine(); // main string
        String q = sc.nextLine(); // weight string
        int k = sc.nextInt();     // max allowed weight
        int n = p.length();
        System.out.println(weighted(p, q, k, n));
    }

    public static int weighted(String p, String q, int k, int n) {
        HashSet<StringBuilder> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
//            String s = "";

            for (int j = i; j < n; j++) {
                sum += q.charAt(j) - '0';  // add weight
//                s += p.charAt(j);          // build substring
                StringBuilder sb=new StringBuilder();
                sb.append(p.charAt(j));

                if (sum <= k) {
                    hs.add(sb);
                } else {
                    break; // stop if weight exceeds limit
                }
            }
        }
        return hs.size();
    }
}

