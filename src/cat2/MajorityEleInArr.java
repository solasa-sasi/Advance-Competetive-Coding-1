package cat2;

import java.util.Scanner;

public class MajorityEleInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(count>n/2){
                System.out.println(arr[i]+" is majority");
            break;}
        }

    }
}

//time complexity=O(n^2)
//space complexity=O(n)
//to reduce the solution to O(n) timecomplexity we can use boyermoors voting algorithm

