package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindingIndexUsingBinarySearch 
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
        
       System.out.println("Enter a key");
       int k=sc.nextInt();
       System.out.println(binarySearch(arr, k));
       sc.close();
	}
	public static int binarySearch(int[] arr, int key) {  
		int start = 0;  
		int end = arr.length-1; 
		while(start<=end) {
			int mid = (start+end)/2; 
			int midEle = arr[mid]; 
			if(key>midEle)  {
				start = mid+1;
			}
			else if(key == midEle){
				return mid;
			}
			else {
				end = mid-1;
			}
		}
	    return -1;
	}
	

}
