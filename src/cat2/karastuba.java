package cat2;

import java.util.Scanner;

public class karastuba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of X");
        int x=sc.nextInt();
        System.out.println("enter the value of Y");
        int y=sc.nextInt();
        int product=karastuba( x, y);
        System.out.println(product);



    }

    static int karastuba(int x,int y){
        if(x<10||y<10){
            return x*y;

        }
        int m=Math.max(getmax(x),getmax(y));
        int halfm=m/2;
        int powerof10=(int)Math.pow(10,halfm);
        int a=x/powerof10;
        int b=x%powerof10;
        int c=y/powerof10;
        int d=y%powerof10;
        int ac=karastuba(a,c);
        int bd=karastuba(b,d);
        int abcd=karastuba(a+b,c+d);
        int result=ac*(int)Math.pow(10,2*halfm) *((abcd-ac-bd)*powerof10)+bd;
        return result;

    }
    //support method
    static int getmax(int x){
        if(x==0){
            return 1;

        }
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;

    }
}
