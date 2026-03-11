package strategy;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting main...");

        int[] testArray = {
                37, 12, 4, 28, 19,
                46, 7, 33, 15, 22,
                9, 41, 26, 3, 18,
                44, 11, 29, 6, 35,
                14, 23, 47, 8, 31
        };

        // Create context
        Context context = new Context();

        // Test bubble sort
        context.setStrategy(new BubbleSortStrategy());

        // Sort and print sorted array to console
        int[] sorted = context.executeStrategy(testArray);
        System.out.println(Arrays.toString(sorted));

        // Test counting sort
        context.setStrategy(new CountingSortStrategy());
        sorted = context.executeStrategy(testArray);
        System.out.println(Arrays.toString(sorted));

        context.setStrategy(new InsertionSortStrategy());
        sorted = context.executeStrategy(testArray);
        System.out.println(Arrays.toString(sorted));

    }
}
