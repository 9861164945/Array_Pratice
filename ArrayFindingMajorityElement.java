package com.pratice.ArrayQuestion;
import java.util.*;
public class ArrayFindingMajorityElement 
{
	
	
public static void main(String[] args) 
    
    {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of the Array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	 System.out.println("Enter elements into the given Array:");
	 for(int i=0;i<size;i++) 
	 {
		 arr[i]=sc.nextInt();
		 
	 }
	 System.out.println(Arrays.toString(arr));
    	
    	System.out.println(findMajorityElement(arr));
    	sc.close();
    }
	
	    public static String findMajorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return Integer.toString(candidate);
        } else {
            return "No majority element.";
        }
    }

    


	
	 
}
