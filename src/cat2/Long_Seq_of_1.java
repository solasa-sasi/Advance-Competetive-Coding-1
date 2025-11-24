package cat2;

import java.util.*;
public class Long_Seq_of_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int flip=sc.nextInt();
        int maxsize=Maxconseq1(num,flip);
        System.out.println(maxsize);
    }
    private static int Maxconseq1(int num,int flip){
        String str=Integer.toBinaryString(num);
        int maxones=Integer.MIN_VALUE;
        int noofreplace=0;
        int i=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='0'){
                noofreplace++;
            }
            while(noofreplace>flip){
                if(str.charAt(i)=='0'){
                    noofreplace--;
                }
                i++;
            }
            maxones=Math.max(maxones,j-i+1);


        }
        return maxones;
    }
}