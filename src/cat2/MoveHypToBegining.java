package cat2;

import java.util.Scanner;

public class MoveHypToBegining {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();

        String s1="";
        String s2="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                s2+="-";
            }
            else{
                s1+=str.charAt(i);
            }
        }

        System.out.println(s2+s1);

    }
}
