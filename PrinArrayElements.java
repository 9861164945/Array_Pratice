package com.pratice.ArrayQuestion;

/*

Write a Java program to create an integer array of size 5.
 Initialize the array with the numbers 10, 20, 30, 40, and 50,
 and display all the elements using a for loop.
*/
import java.util.*;
class PrinArrayElements
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}