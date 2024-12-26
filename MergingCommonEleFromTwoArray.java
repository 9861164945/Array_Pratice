package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class MergingCommonEleFromTwoArray 
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
        System.out.println("Array:1 " + Arrays.toString(arr));
        
    
    
        int arr2[] = new int[n];
        
        System.out.println("Enter " + n + " elements into the  Second array:");
        for (int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        } 
        System.out.println("Array 2: " + Arrays.toString(arr2));
        int common[]=findCommonElements(arr, arr2);
		System.out.println(Arrays.toString(common));
	}
	public static int[] findCommonElements(int[] arr1, int[] arr2) {
	    int[] common = new int[Math.min(arr1.length, arr2.length)]; 
	    int index = 0; 
	    for (int num1 : arr1) {
	        for (int num2 : arr2) {
	            if (num1 == num2) {
	                common[index++] = num1; 
	                break; }
	        }
	    }
	    return Arrays.copyOf(common, index); 
	}

}
