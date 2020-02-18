package org.example;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Random Number
 */
public class App {
    public static void main(String[] args) {

        int[] randomNumbers = IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(0, 10000 + 1))
                .limit(100)
                .boxed()
                .mapToInt(i -> i)
                .toArray();

        System.out.println("Printing the whole array...");
        Arrays.stream(randomNumbers)
                .forEach(System.out::println);
        System.out.println("Sorted Array ");
        sortingArray(randomNumbers);
        System.out.print(Arrays.toString(randomNumbers));

        System.out.println("\n\nThe largest number is: " + findLargestNumber(randomNumbers));
        System.out.println("\n\nThe smallest number is: " + findSmallestNumber(randomNumbers));
    }
    private static int findLargestNumber(int[] getRandomNumber)
    {
        int largestNumber = Arrays.stream(getRandomNumber)
                .max()
                .getAsInt();
        return largestNumber;
    }
    private static int findSmallestNumber(int[] n)
    {
        int smallestNumber = Arrays.stream(n)
                .min()
                .getAsInt();
        return smallestNumber;
    }
    private static void sortingArray(int[] n)
    {
        Arrays.sort(n);
    }
}