package com.pratice.ArrayQuestion;
import java.util.Arrays;
import java.util.Scanner;


public class ArraySearch 
{
	public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the Array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter elements into the array:");
	        for (int i = 0; i < n; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println(Arrays.toString(arr));

	        System.out.println("Enter the element you want to search:");
	        int target = sc.nextInt();
	        int result = Search(arr, target);

	        if (result == -1)
	        {
	            System.out.println("Element not found in the array.");
	        } 
	        else 
	        {
	            System.out.println("The element is found at index " + result);
	        }

	        sc.close();
	    }

	    static int Search(int[] arr, int target) 
	    {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start <= end) 
	        {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) 
	            {
	                end = mid - 1;
	            } 
	            else if (target > arr[mid]) 
	            {
	                start = mid + 1;
	            } 
	            else 
	            {
	                return mid; 
	            }
	        }

	        return -1; 
	    }
   


}
