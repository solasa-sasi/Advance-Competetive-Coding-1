//package cat2;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class weighted_substring {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String p=sc.nextLine();
//        String q=sc.nextLine();
//        int k=sc.nextInt();
//        int n=q.length();
//        System.out.println(weighted(p,q,k,n));
//    }
//    public static int weighted(String p,String q,int k,int n){
////        HashMap<String,Integer> pair=new HashMap<String,Integer>();
//        HashSet<String> hs=new HashSet<String>();
//         for(int i=0;i<n;i++){
//             int sum=0;
//             String s="";
//             for(int j=i;j<n;j++){
//                 int pos=p.charAt(j)-'a';
//                 sum+=q.charAt(j)-'0';
//                 s+=p.charAt(j);
//                 if(sum<=k){
//                     hs.add(s);
//                 }
//                 else{
//                     break;
//                 }
//
//             }
//         }
//        return hs.size();
//    }
//}




//package cat2;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class weighted_substring {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String p = sc.nextLine(); // original string
//        String q = sc.nextLine(); // weights string (digits)
//        int k = sc.nextInt();     // weight limit
//        int n = p.length();
//        System.out.println(weighted(p, q, k, n));
//    }
//
//    public static int weighted(String p, String q, int k, int n) {
//        HashSet<String> hs = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            StringBuilder sb = new StringBuilder();
//
//            for (int j = i; j < n; j++) {
//                sum += q.charAt(j) - '0';   // add weight of current char
//                sb.append(p.charAt(j));     // extend substring
//
//                if (sum <= k) {
//                    hs.add(sb.toString());
//                } else {
//                    break; // stop if weight exceeds k
//                }
//            }
//        }
//        return hs.size();
//    }
//}

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
            String s = "";

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

