package cat2;

import java.util.Scanner;

public class Maxsum_of_hour_glass {
    static int Max_sum(int matrix[][],int row,int col){
        if(row<3||col<3)
            return -1;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){

                int sum=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];


                if (sum>max_sum){
                    max_sum=sum;
                }

            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of columns");
        int cols=sc.nextInt();

        int matrix[][]=new int[rows][cols];


        System.out.println("enter the elements of a matrix by giving space between two elements");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        System.out.println(Max_sum(matrix,rows,cols));


    }
}
//the number of hour glasses formed in a matrix is (rows-2)*(cols-2)
//the time complexity is O(rows*columns)
//the space complexity is O(1)

