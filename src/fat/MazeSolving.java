package fat;

import java.util.Scanner;

public class MazeSolving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];

    }
    static boolean mz(int[][] arr,int r,int c){
        int[][] res=new int[r][c];
        if(mzutil(arr,0,0,res,r,c)) {
            System.out.println("Solution exists");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println(res[i][j] + " ");
                }
            }
            return true;
        }
        else{
            System.out.println("No solution exists");
            return false;
        }
    }
    static boolean mzutil(int[][] arr,int start,int ending,int[][] res,int r,int c){
        if(start==r-1&&ending==c-1&&arr[start][ending]==1){
            res[start][ending]=1;
            return true;

        }
        if(start>=0&&start<r&&ending>=0&&ending<c&&arr[start][ending]==1){
            if(res[start][ending]==1){
                return false;
            }
            if(mzutil(arr,start+1,ending,res,r,c)){//down
                return true;
            }
            if(mzutil(arr,start,ending+1,res,r,c)){//right
                return true;
            }
            if(mzutil(arr,start,ending-1,res,r,c)){//left
                return true;
            }
            if(mzutil(arr,start-1,ending,res,r,c)){//up
                return true;
            }

            res[start][ending]=0;
            return false;
        }
                return false;
        }


}
