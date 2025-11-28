package cat2;

import java.util.*;

class Max_Equilibrium_sum {
    static int findMaxSum(int arr[], int n) {
        int sum = 0;
        for (int num : arr) sum += num;

        int prefix_sum = 0;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum -= arr[i]; // right-side sum
            if (prefix_sum == sum)
                res = Math.max(res, prefix_sum);
            prefix_sum += arr[i]; // left-side sum
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMaxSum(arr, n);
        if (result != Integer.MIN_VALUE)
            System.out.println(result);
        else
            System.out.println("No equilibrium sum found.");

        scanner.close();
    }

    //bruteforce approach
    static int equilibriumsum(int[] arr){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            for(int l=0;l<i;l++){
                leftsum+=arr[l];
            }
            for(int r=i+1;r<n;r++){
                rightsum+=arr[r];
            }
            if(leftsum==rightsum){
                maxsum=Math.max(maxsum,leftsum);
            }
        }return maxsum;

    }
}
