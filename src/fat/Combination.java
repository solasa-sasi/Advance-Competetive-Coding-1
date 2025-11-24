package fat;

import java.util.*;

public class Combination {
    static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }

        if (i >= n) {
            return;
        }

        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i + 1);

        while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }

        combinationUtil(arr, n, r, index, data, i + 1);
    }

    static void printCombination(int arr[], int n, int r) {
        Arrays.sort(arr);

        int data[] = new int[r];
        combinationUtil(arr, n, r, 0, data, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        printCombination(arr, n, r);
    }
}


