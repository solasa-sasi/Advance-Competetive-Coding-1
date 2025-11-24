package cat1;

//public class EulerPhi {
//    static int phi(int n){
//        int result=n;
//
//        for(int p=2;p*p<=n;p++){
//            if(n%p==0){
//                while(n%p==0){
//                    n/=p;
//                }
//                result-=result/p;
//            }
//        }
//        if(n>1){
//            result-=result/n;
//
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int n=36;
//        System.out.println("Euler's Totient φ(" + n + ") = " + phi(n));
//    }
//}



public class EulerPhi {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int phi(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Euler Totient φ(" + n + ") = " + phi(n));
    }
}
