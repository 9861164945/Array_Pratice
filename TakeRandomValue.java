package com.pratice.ArrayQuestion;

import java.util.Random;
import java.util.*;
class TakeRandomValue
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
        Random random = new Random();
        int arr[]=new int[n];
        System.out.println("Enter"+n +"Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=random.nextInt(100)+1;
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}