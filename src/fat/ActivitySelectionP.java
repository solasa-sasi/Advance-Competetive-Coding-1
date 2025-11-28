package fat;

import java.util.*;
public class ActivitySelectionP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] start = new int[n];
        int[] finish = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
            finish[i] = scanner.nextInt();
        }
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> finish[i]));
        int lastFinishTime = -1;
        ArrayList<Integer> selectedIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int idx = indices[i];
            if (start[idx] >= lastFinishTime) {
                selectedIndices.add(idx);
                lastFinishTime = finish[idx];
            }
        }
        for (int idx : selectedIndices) {
            System.out.print("(" + start[idx] + ", " + finish[idx] + ") ");
        }
    }
}
