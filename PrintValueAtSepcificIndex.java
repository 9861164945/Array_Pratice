package com.pratice.ArrayQuestion;


/*

*/
import java.util.*;
class PrintValueAtSepcificIndex
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
    
        int arr[]=new int[n];
        System.out.println("Enter"+n +"Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]);
        
    }
}