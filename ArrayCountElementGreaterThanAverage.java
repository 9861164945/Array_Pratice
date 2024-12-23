package com.pratice.ArrayQuestion;
import java.util.*;

public class ArrayCountElementGreaterThanAverage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements into the given Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayCountElementGreaterThanAverage obj = new ArrayCountElementGreaterThanAverage();
        
        System.out.println("Array: " + Arrays.toString(arr));
        int count = obj.findOutElementsGreaterThanAvg(arr);
        
        System.out.println("Number of elements greater than the average: " + count);
    }

    private int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private double calculateAvg(int[] arr) {
        int sum = calculateSum(arr);
        return sum / (double) arr.length;
    }

    private int findOutElementsGreaterThanAvg(int[] arr) {
        double avg = calculateAvg(arr);
        int count = 0;
        
        System.out.println("Elements greater than the average:");
        for (int i : arr) {
            if (i > avg) {
                System.out.println(i);
                count++;
            }
        }
        
        return count;
    }
}
