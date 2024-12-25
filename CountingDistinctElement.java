
package com.pratice.ArrayQuestion;

import java.util.*;

public class CountingDistinctElement 
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
		
		printUnique(arr);
		
		
	}
	private static void printUnique(int []arr)
	{
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1) {
				System.out.print("Unique elements are: "+arr[i] + " ");
			}
		}
		System.out.println();
		
	}

}
