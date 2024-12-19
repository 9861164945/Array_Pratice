package com.pratice.ArrayQuestion;
import java.util.*;
public class CalculateArrayElementSum 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of the Arrray");
		int size= sc.nextInt();
		int  []arr=new int[size];
		System.out.println("Enter elements Into the given Array");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Sum of all the elements are present in the array is "+calculateSum(arr,size));
		System.out.println("Substraction of all the elements are present in the array is "+calculateSub(arr,size));
		
		System.out.println("Multiplication of alll the Elements  are present in Array: "+calculateProduct(arr,size));
		sc.close();
		
	}
	// methoods for Calculate Sum,sub
	
	 private static int calculateSum(int arr[],int n) {
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	private static int calculateSub(int arr[],int n) 
	{
		int sub=0;
		for(int i=0;i<n;i++) 
		{
			sub-=arr[i];
			
		} 
		return sub;
	}
	
	private static int calculateProduct(int arr[],int n) 
	{
		int prod=1;
		for(int i=0;i<n;i++)
		{
			prod*=arr[i];
		}
		return prod;
		
	}

}
