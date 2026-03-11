package strategy;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting main...");

        Random rng = new Random();

        // Small array of 30
        int[] smallArray = new int[30];
        for (int i = 0; i < smallArray.length; i++) {
            smallArray[i] = rng.nextInt(50); // 0–49
        }

        // Large array of 500
        int[] largeArray = new int[500];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rng.nextInt(50);
        }

        // Create context
        Context context = new Context();

        // Test Bubble Sort
        context.setStrategy(new BubbleSortStrategy());
        System.out.println("\nBubble Sort (small array):");
        System.out.println(Arrays.toString(context.executeStrategy(smallArray)));

        System.out.println("\nBubble Sort (large array):");
        System.out.println(Arrays.toString(context.executeStrategy(largeArray)));

        // Test Counting Sort
        context.setStrategy(new CountingSortStrategy());
        System.out.println("\nCounting Sort (small array):");
        System.out.println(Arrays.toString(context.executeStrategy(smallArray)));

        System.out.println("\nCounting Sort (large array):");
        System.out.println(Arrays.toString(context.executeStrategy(largeArray)));

        // Test Insertion Sort
        context.setStrategy(new InsertionSortStrategy());
        System.out.println("\nInsertion Sort (small array):");
        System.out.println(Arrays.toString(context.executeStrategy(smallArray)));

        System.out.println("\nInsertion Sort (large array):");
        System.out.println(Arrays.toString(context.executeStrategy(largeArray)));
    }
}
