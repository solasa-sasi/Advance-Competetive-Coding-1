package cat1;

import java.util.Scanner;

public class segmentedsieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the low");
        int low=sc.nextInt();
        System.out.println("enter the high");
        int high=sc.nextInt();

        boolean[] prime=new boolean[high+1];

        for(int i=2;i<=high;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=high;p++){
            if(prime[p]){
                int start=Math.max(p*p,((low+p-1)/p)*p);
                for(int i=start;i<=high;i+=p){
                    prime[i]=false;
                }
            }
        }
        System.out.println("Prime numbers in range [" + low + ", " + high + "]:");
        for (int i = low; i <= high; i++)
            if (prime[i]) System.out.print(i + " ");

        sc.close();
    }
}
