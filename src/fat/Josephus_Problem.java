package fat;

import java.util.Scanner;

//application oriented programming
public class Josephus_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //target position
        int k=sc.nextInt();

        System.out.println(Josephus(n,k));
    }
    private static int Josephus(int n,int k){
        if(n==1){
            return 1;
        }
        return (Josephus(n-1,k)+k-1)%n+1;

    }
}
