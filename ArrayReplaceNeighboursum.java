package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplaceNeighboursum 
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
        addNeighborElements(arr);
    
		
	}
	public static void  addNeighborElements(int []arr) 
	{
		int[]copy=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) 
		{
			if(i==0) 
			{
				copy[i] = arr[i + 1];
				
			}
			else if(i==arr.length-1) 
			{
				copy[i] = arr[i-1];
				
			}
			else
			{
				copy[i] = arr[i - 1] + arr[i + 1];
				
			}
			
			
		}
		System.out.println(Arrays.toString(copy));
		
		
	}

}
