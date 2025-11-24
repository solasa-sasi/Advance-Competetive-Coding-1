package fat;

import java.util.Scanner;

public class manuering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(numofPaths(m,n));

    }
    static int numofPaths(int m,int n){
        if(m==1||n==1) return 1;
        return numofPaths(m-1,n)+numofPaths(m,n-1);
    }
}
//time complexity O(2^(m+n))
//space complexity O(m+n)