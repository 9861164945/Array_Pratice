package com.pratice.ArrayQuestion;
import java.util.*;
public class ArrayPrint 
{
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENter the Size Of the Array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		// for Inserting Elements into The Array
		System.out.println("Enter elements Into the Following Array:");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		// Printing the Array
		System.out.println("Orginal:"+Arrays.toString(arr));
		sc.close();		
}

}
