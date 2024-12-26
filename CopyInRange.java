package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CopyInRange 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
    
        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements into the given array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        } 
        System.out.println("Array: " + Arrays.toString(arr));
        
        System.out.println("Enter starting index:");
        int start = sc.nextInt();
        System.out.println("Enter ending index:");
        int end = sc.nextInt();
        
        int arr2[] = copyElementsIndexRange(arr, start, end);
        System.out.println(Arrays.toString(arr2));
        
        sc.close();
    }

    public static int[] copyElementsIndexRange(int[] arr, int start, int end) 
    {
        int mid = end - start;
        int[] copy = new int[mid];
        int i = 0;
        for (int index = start; index < end; index++) 
        {
            copy[i] = arr[index];
            i++;
        }
        return copy;
    }
}
