package fat;

import java.util.Scanner;

public class Manachers_Algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(longestPalindrome(str));
    }
    static String longestPalindrome(String s){
        StringBuilder t=new StringBuilder();
        t.append("#");
        for(int i=0;i<s.length();i++){
            t.append(s.charAt(i)).append("#");
        }
        char[] c=t.toString().toCharArray();
        int n=c.length;
        int[] p=new int[n];

        int center=0;
        int right=0;
        int centerIndex=0;
        int maxLeng=0;
        for(int i=0;i<n;i++){
            int mirror=2*center-i;
            if(i<right){
                p[i]=Math.min(right-i,p[mirror]);

            }
            while(i + p[i] + 1 < n && i - p[i] - 1 >= 0 && c[i + p[i] + 1] == c[i - p[i] - 1]){
                p[i]++;

            }
            if(i+p[i]>right){
                center=i;
                right=i+p[i];
            }
            if(p[i]>maxLeng){
                centerIndex=i;
                maxLeng=p[i];
            }


        } int start=(centerIndex-maxLeng)/2;
        return s.substring(start,start+maxLeng);


    }


}
//2 to 3 mcq's
//naive approach
//center expansion
//mirror approach
//2*n+3
//mirror=2*center-1

