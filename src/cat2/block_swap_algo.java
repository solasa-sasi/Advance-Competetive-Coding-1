package cat2;

import java.util.Scanner;

public class block_swap_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length of an array");

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("d count");
        //no of rotations
        int d=sc.nextInt();

        if(d>n){
            d=d%n;
        }
        //Step 1 – Reverse the whole array
        reverse(arr,0,n-1);
        //Step 2 – Reverse the first (n - d)
        reverse(arr,0,n-1-d);
        //Step 3 – Reverse the last d
        reverse(arr,n-d,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
//inplace algorithm(no extra space is required--O(1))
//time complexity-O(n)
