package cat2;

import java.util.Scanner;

public class Max_Product_SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements in an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(maxproduct(arr));
        System.out.println(brutemaxProduct(arr));




        }
    static int maxproduct(int[] arr){
        int n=arr.length;
        int prefix=1;
        int suffix=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=arr[i];
            suffix*=arr[n-i-1];
            res=Math.max(res,Math.max(prefix,suffix));
        }
        return res;

    }
//brute force approach
    static int brutemaxProduct(int[] nums) {
        int n = nums.length;
        int maxprod = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                maxprod = Math.max(maxprod, prod);
            }
        }

        return maxprod;
    }


    }


//no of sub-arrays in an array is n*(n+1)/2
// for the sub-array the elements should be contiguous
//kadane algorithm
