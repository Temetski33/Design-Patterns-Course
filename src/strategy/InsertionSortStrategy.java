package strategy;

public class InsertionSortStrategy implements SortingStrategy{
    @Override
    // Most of this code taken directly from geeksforgeeks sorting algorithm section.
    public int[] sort(int[] array) {
        int[] arr = array.clone();
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

}
