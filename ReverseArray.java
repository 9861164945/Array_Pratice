package com.pratice.ArrayQuestion;
import java.util.*;

/*
 *  Reversing Array Using Swap method and Reverse Method
 * */

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size  of the Array:");
		int size=sc.nextInt();
		int []arr=new int[size];
	
		System.out.println("Enter elements Into The Given Array:");
		for(int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array"+Arrays.toString(arr));
		
		Reverse(arr, size);
		System.out.println("After Reversing"+Arrays.toString(arr));
		sc.close();
		
	}
	 private static void Reverse(int[] arr, int n)
	 {
        int start = 0;
        int end = n - 1;
        while (start < end)
        {
            Swap(arr, start, end);  
            start++;
            end--;
        }
    }

     private static void Swap(int[] arr, int p, int q) 
     {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

}
