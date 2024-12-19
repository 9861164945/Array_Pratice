package com.pratice.ArrayQuestion;
import java.util.*;
public class ArraySwapUserInoutElement 
{ public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size of the Given Array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter elements into the given Array:");
	for(int i=0;i<size;i++) 
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("SHow Array"+Arrays.toString(arr));
	Swap(arr,1,2);
	System.out.println("After Swapping Array:"+Arrays.toString(arr));
	sc.close();
}
 private static void Swap(int arr[],int start,int end) 
{
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	
	
}

}
