package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CountingPrintDuplicate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the siz eof the Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("ENter elements into the given Array:");
		for(int i=0;i<n;i++) 
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array"+Arrays.toString(arr));
		printDuplicate(arr);
		
	}
	
private static void printDuplicate (int arr[]) 
{
	
	for (int i = 0; i < arr.length; i++) {
		int count = 1;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] == arr[j])
				count++;
		}
		if (count == 2) {
			System.out.print(" Duplicate elements are: "+arr[i] + " ");
		}
	}
	System.out.println();
}
}
