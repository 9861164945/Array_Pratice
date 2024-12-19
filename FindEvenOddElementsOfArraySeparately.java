package com.pratice.ArrayQuestion;


import java.util.*;

public class FindEvenOddElementsOfArraySeparately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements into the array:");
        for (int i = 0; i < n; i++) 
        { 
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: " + Arrays.toString(arr));

        FindEvenOddElementsOfArraySeparately obj = new FindEvenOddElementsOfArraySeparately();
        obj.findEvenOdd(arr, n); 
        sc.close(); 
    }

    public void findEvenOdd(int arr[], int n) {
        System.out.println("Even Elements:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) { 
            }
        }

        System.out.println("Odd Elements:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { 
                System.out.print(arr[i]);
            }
        }
    }
}
