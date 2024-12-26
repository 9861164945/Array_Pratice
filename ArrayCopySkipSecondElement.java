package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopySkipSecondElement
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
        int arr2[]=skipEverySecond(arr);
        System.out.println(Arrays.toString(arr2));
		
	}
	public static int[] skipEverySecond(int[] arr) {
	    int[] copy = new int[arr.length / 2 + (arr.length % 2)]; 
	    int index = 0;
	    for (int i = 0; i < arr.length; i += 2) {
	        copy[index++] = arr[i];
	    }
	     return copy;
	}

}
