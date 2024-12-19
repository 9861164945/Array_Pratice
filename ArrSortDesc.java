package com.pratice.ArrayQuestion;
import java.util.*;
public class ArrSortDesc

{


	   public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Size of the Array:");
	   int n=sc.nextInt();
	   int [] arr=new int[n];
	   System.out.println("Enter Elemets into the Array:");

	   for(int i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	   System.out.println("The Array is:");
	   for(int i=0;i<n;i++){
	       System.out.print(" "+arr[i]);
	   }
	  
	   for ( int i = 0; i < n - 1; i++) 
	   {
	       for (int j = 0; j < n - i - 1; j++)
	       {
	           if (arr[j] < arr[j + 1])
	           {
	               
	                int temp = arr[j];
	               arr[j] = arr[j + 1];
	               arr[j + 1] = temp;
	           }
	       }
	   }
	   System.out.println("\n Sorted Array:");
	   for(int i=0;i<n;i++)
	   {
	       System.out.print(" "+arr[i]);
	   }
	   sc.close();
	       
	   }
}
