package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInSpecificRange {
	


	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of the array:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("ENter elements Into The given Array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter elemnt what you want to search");
		int target=sc.nextInt();
		System.out.println("ENter start index");
		int start=sc.nextInt();
		System.out.println("ENter Ending Index");
		int end=sc.nextInt();
		if(start>end||end>=n||start<0) 
		{
			System.out.println("Invalid Range:");
			
		}
		else 
		{
			if(target==-1) 
			{
				System.out.println("Element not found:");	
			}
			else 
			{
			int ans=binarySearchRange(arr, target, start, end);
			System.out.println("Element Found at "+ans+" index");
			}
		}
			
	}	
		
		
	
	public static int binarySearchRange(int arr[],int target,int start,int end) 
	{
		
		if(arr.length==0)
		{
			return -1;
		}
		for (int index = start; index <= end; index++) 
		{
            int element = arr[index];
            if (element == target)
            {
            	
                return index;
            }
          
		}
		  return -1;
		}

	
}

