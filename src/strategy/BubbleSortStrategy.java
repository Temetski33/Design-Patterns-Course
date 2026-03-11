package strategy;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    // Most of this code taken directly from geeksforgeeks sorting algorithm section.
    public int[] sort(int[] array) {
        int[] sortedArray = array.clone();
        int n = sortedArray.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, then break
            if (!swapped)
                return sortedArray;
        }
        return sortedArray;
    }
}
