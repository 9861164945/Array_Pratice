package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray 
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
        
        sc.close();
        int []arr2=copyArray(arr);
        System.out.println( "Copy Array:"+Arrays.toString(arr2));
		
	}
	public static int[] copyArray(int[] arr) 
	{
		int[]copy=new int[arr.length];
		for(int i=0;i<copy.length;i++) 
		{
			copy[i]=arr[i];
			
		}
		return copy;
		
	}

}
