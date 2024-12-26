package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedianofaSortedArray 
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
	       System.out.println(" Median is:"+findMedian(arr)); 
	sc.close();	
	}
	public static double findMedian(int[] arr) {
        int n = arr.length;
        
        
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
             return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }


}
