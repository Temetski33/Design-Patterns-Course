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
            smallArray[i] = rng.nextInt(50);
        }

        // Large array of 500
        int[] largeArray = new int[500];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rng.nextInt(50);
        }

        Context context = new Context();

        // Bubble Sort
        context.setStrategy(new BubbleSortStrategy());

        System.out.println("\nBubble Sort (small array):");
        long start = System.nanoTime();
        int[] sorted = context.executeStrategy(smallArray);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");

        System.out.println("\nBubble Sort (large array):");
        start = System.nanoTime();
        sorted = context.executeStrategy(largeArray);
        end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");

        // Counting Sort
        context.setStrategy(new CountingSortStrategy());

        System.out.println("\nCounting Sort (small array):");
        start = System.nanoTime();
        sorted = context.executeStrategy(smallArray);
        end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");

        System.out.println("\nCounting Sort (large array):");
        start = System.nanoTime();
        sorted = context.executeStrategy(largeArray);
        end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");

        // Insertion Sort
        context.setStrategy(new InsertionSortStrategy());

        System.out.println("\nInsertion Sort (small array):");
        start = System.nanoTime();
        sorted = context.executeStrategy(smallArray);
        end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");

        System.out.println("\nInsertion Sort (large array):");
        start = System.nanoTime();
        sorted = context.executeStrategy(largeArray);
        end = System.nanoTime();
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time: " + (end - start) + " ns");
    }
}
