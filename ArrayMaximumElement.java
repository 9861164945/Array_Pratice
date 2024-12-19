package com.pratice.ArrayQuestion;
import java.util.*;
public class ArrayMaximumElement 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the Array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n]; 
	        System.out.println("Enter Elements into the Array:");
	        for (int i=0;i<n;i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Array: " + Arrays.toString(arr));

	        // Call the Max method to find the maximum value in the array
	        
	        int maxVal = Max(arr, n);
	        int minVal=Min(arr,n);
	        System.out.println("Maximum Value: " + maxVal);
	        System.out.println("Minimum Value is:"+minVal);
	        sc.close();
	    }

	   private  static int Max(int[] arr, int n)
	    {
	        int maxVal = arr[0];  // Start with the first element as the maximum
	        for (int i=1;i<n;i++) 
	        {   // Start loop from the second element
	            if (arr[i]>maxVal) 
	            {
	                maxVal=arr[i];  // Update maxVal if a larger value is found
	            }
	        }
	        return maxVal;  // Return the maximum value found
	   
}
	   

       private static int Min(int[]arr,int n) 
       {
       	int minVal=arr[0];//Start With The First Element as Minimum
       	for(int i=1;i<n;i++) 
       	{
       		//Start Loop from The Second element;
       		if(arr[i]<minVal) {
       			minVal=arr[i];//Update Minval if a smaller value is found 
       		}
       		
       		
       	}
       	return minVal;//Return the minimum Value;v
       	
       }

	       	
	
}
