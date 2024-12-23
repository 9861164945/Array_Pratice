package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CountingElements {
    public static String countElementsExactlyKTimes(int[] arr, int k) {
        int n = arr.length;
        int count;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == k && result.indexOf(Integer.toString(arr[i])) == -1) {
                result.append(arr[i]).append(" ");
            }
        }

        if (result.length() == 0) {
            return "No element found";
        } else {
            return result.toString().trim();
        }
    }

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
    	 System.out.println("Enter Kth Value");
        int k = sc.nextInt();
        System.out.println(countElementsExactlyKTimes(arr, k));
        sc.close();
    }
}
