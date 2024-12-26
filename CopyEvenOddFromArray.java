package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CopyEvenOddFromArray 
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
        int []arr2=evenElement(arr);
        System.out.println("Even element:" +Arrays.toString(arr2));
        int []arr3=oddElement(arr);
        System.out.println("Odd element:"+Arrays.toString(arr3));
        sc.close();
	
	}
	private static int[]evenElement(int a[]) 
	{
		int count=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				count++;
				
				
			}
			
		}
		int k=0;
		int copy[]=new int[count];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) {
				copy[k++]=a[i];
				
			}	
			
		}
		return copy;
	}
	private static int[]oddElement(int a[]) 
	{
		int count=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				count++;
				
				
			}
			
		}
		int k=0;
		int copy[]=new int[count];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) {
				copy[k++]=a[i];
				
			}	
			
		}
		return copy;
	}

}
