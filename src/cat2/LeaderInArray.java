//package cat2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class LeaderInArray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the no of elements in an array ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("enter the  elements in an array by giving space ");
//
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        ArrayList<Integer>  leaders=findleaders(arr);
//        for(int x:leaders){
//            System.out.print(x+" ");
//        }
//
//
//        }
//
//        static ArrayList<Integer> findleaders(int[] arr){
//        ArrayList<Integer> leaders=new ArrayList<>();
//        int n=arr.length;
//        int maxFromRight=arr[n-1];
//        leaders.add(maxFromRight);
//
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]>maxFromRight){
//                leaders.add(arr[i]);
//                maxFromRight=arr[i];
//            }
//        }
//
//            Collections.reverse(leaders);
//
//        return leaders;
//
//
//
//        }
//    }
//
package cat2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> leaders = findLeaders(arr);

        System.out.print("Leaders in the array: ");
        for (int x : leaders) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}
