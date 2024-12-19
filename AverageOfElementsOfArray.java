package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfElementsOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements into the given Array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum of all the elements present in the array is " + calculateSum(arr, size));
        System.out.println("Average of all the elements present in the array is " + FindOutAverage(arr, size));

        sc.close();
    }

    private static int calculateSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static double FindOutAverage(int[] arr, int n) {
        int sum = calculateSum(arr, n);
        double average = (double) sum / n;
        return average;
    }
}
