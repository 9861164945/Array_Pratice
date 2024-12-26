package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvenOddElementIndex {

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
        checkIndexPositionEvenOdd(arr);
       sc.close(); 
		
	}
	
public  static  void checkIndexPositionEvenOdd(int []arr) 
	{
		
	System.out.println("Even index elements:");
		for(int i=0;i<arr.length;i++) 
		{
			if(i%2==0) 
			{
				System.out.println("Index " + i + ": " + arr[i]);
				
		}}
		System.out.println("odd index elements:");
			for(int i=0;i<arr.length;i++) {
			
			
				
				if(i%2!=0) 
				{
					System.out.println("Index " + i + ": " + arr[i]);
				
				}
				}
			
		
		
		
	}
}
