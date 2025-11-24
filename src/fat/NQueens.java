package fat;

import java.util.*;
class NQueens {
    static boolean issafe(int[][] mat, int row, int col, int n) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (mat[row][col] == 1) return false;
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (mat[row][col] == 1) return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < n) {
            if (mat[row][col] == 1) return false;
            col--;
            row++;
        }
        return true;
    }

    static void solveNQueens(int mat[][], int n, int col) {
        if (col == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int row = 0; row < n; row++) {
            if (issafe(mat, row, col, n)) {
                mat[row][col] = 1;
                solveNQueens(mat, n, col + 1);
                mat[row][col] = 0;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=0;
            }
        }
        solveNQueens(mat,n,0);
    }

}