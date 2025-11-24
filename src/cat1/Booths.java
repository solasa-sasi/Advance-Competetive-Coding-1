package cat1;

import java.util.Scanner;

public class Booths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the multiplicand");
        int a=sc.nextInt();
        System.out.println("enter the multiplier");
        int b=sc.nextInt();
        int product=0;
        int n=Integer.toBinaryString(a).length();
        for(int i=0;i<=n;i++){
            //to check if the last bit of a is 1 or not
            int currBit=a&1;
            if(currBit==1){
                product+=b;
            }
            b<<=1;
            a>>=1;
        }

        System.out.println("result :"+product);
    }
}
//for bits calculation the time complexity will be in the form of log
//
