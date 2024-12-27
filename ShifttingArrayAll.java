package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ShifttingArrayAll 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
    
        int arr[]=new int[n];
        
        System.out.println("Enter"+ n +"Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        } 
        System.out.println("Array:"+Arrays.toString(arr));
        rightShift(arr);
        System.out.println(Arrays.toString(arr));
         leftShift(arr);
         System.out.println(Arrays.toString(arr));
        
       
        System.out.println("Enter how many rtim e you want to totate the arry:");
        int k=sc.nextInt();
        
        rotateAnticlockWise(arr,k);
        System.out.println(Arrays.toString(arr));
        sc.close();
	}

	private static void rightShift(int []arr) 
	{
		int temp=arr.length;
		for(int i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		
	}
	private static void leftShift(int []arr) 
	{
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) 
		{
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		
	}
	private static void rotateAnticlockWise(int []arr,int k) 
	{
	
		k%=arr.length;
		while(k!=0) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) 
		{
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		k--;
		}
		
	}
}
