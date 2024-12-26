package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindingFrequency 
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
        findFrequency(arr);
		
	}
	private static void findFrequency(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        int count = 1;
	        
	       
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                count++;
	                arr[j] = -1;  
	                }
	        }
	        
	        
	        if (arr[i] != -1) {
	            System.out.println(arr[i] + " = " + count);
	        }
	    }
	}
}
