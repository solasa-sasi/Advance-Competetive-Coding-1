package fat;

import java.util.Scanner;
import java.util.TreeSet;

public class SortedUniquePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        TreeSet<String> ts = new TreeSet<>();
        generatePermutations(s.toCharArray(),0,s.length()-1,ts);
       for(String a: ts){
           System.out.println(a+" ");
       }
    }
    static void generatePermutations(char[] arr,int start,int end,TreeSet<String> ts){
        if(start==end){
            ts.add(new String(arr));
        }
        else{
            for(int i=start;i<=end;i++){
                swap(arr,start,i);
                generatePermutations(arr,start+1,end,ts);
                swap(arr,start,i);
            }
        }
    }
    static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
//hashset-------- a,b,c->c,b,a(random)
//linked hashset-----insertion-
//treeset----3,5,2,1,4---->1,2,3,4,5(sorted order)

//bruteforce approach
//1.generate all permutation
//2.store list or array
//3.remove duplicates
//4.sorted unique perumatation
//time complexity is O(n*n!logn!)

//n! ways of permutations


