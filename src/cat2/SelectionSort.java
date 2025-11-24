package cat2;
//
//import java.util.Scanner;
//
//public class SelectionSort {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("enter the elements of an array");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        arr=SelectionSort(arr,n);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//    }
//     static int[] SelectionSort(int arr[],int size){
//        for(int i=0;i<size;i++){
//            int min=i;
//
//            for(int j=i+1;j<size;j++){
//                if(arr[j]<arr[min]){
//                    min=j;
//                }
//            }
//            int temp=arr[min];
//            arr[min]=arr[i];
//            arr[i]=temp;
//        }
//        return arr;
//    }
//}
////time complexity=O(n^2)
////space complexity is O(1)


import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
