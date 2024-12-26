package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplaceNegative 
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
        replaceNegative(arr);
		
	}
	public static void replaceNegative(int[]arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<0) 
			{
				arr[i]=0;
				
				
			}
			
		}
		System.out.println(" After Replacing with zero: "+Arrays.toString(arr));
		
		
		
	}

}
