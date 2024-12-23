package com.pratice.ArrayQuestion;
import java.util.*;
public class ArrayCountEvenOddElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the size of the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements into the Given  Array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		CountEvenOddElement(arr);
		
		
		
	}
	public static void CountEvenOddElement(int arr[]) 
	{
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) 
			{
				evenCount++;
			System.out.println("Even Numbers Are"+arr[i]);
			
			}
			else
			{
				oddCount++;
				System.out.println("Odd Numbers are "+arr[i]);
				
				
			}
			
		}
		System.out.println("There are "+evenCount+" No of element are even number");
		System.out.println(" There are  "+oddCount+" no of elements Are Odd number");
		
	}

}
