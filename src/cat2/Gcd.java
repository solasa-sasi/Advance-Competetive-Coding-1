package cat2;

import java.util.Scanner;

public class Gcd {
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
        int a= sc.nextInt();
        System.out.println("enter the b");
        int b=sc.nextInt();

        int gcd=gcd(a,b);
        System.out.println(gcd);
    }
}
