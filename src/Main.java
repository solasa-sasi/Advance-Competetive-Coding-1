import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        boolean[] prime=new boolean[size+1];
        System.out.println(Arrays.toString(prime));
        for(int i=0;i<=size;i++){
        prime[i]=true;}

        for(int p=2;p*p<=size;p++){
            if(prime[p]){
                for(int i=p*p;i<=size;i+=p){
                    prime[i]=false;
                }
            }
        }
    }
}

//create boolean array
//mark all numbers as prime
//find multiples and mark as non prime
//print remaining numbers