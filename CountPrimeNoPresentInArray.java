package com.pratice.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrimeNoPresentInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements into the given Array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        checkPrime(arr);
    }

    private static void checkPrime(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (isPrime(arr[i])) 
            {
                System.out.println(arr[i] + " is a prime number");
            } 
            else 
            {
                System.out.println(arr[i] + " is not a prime number");
            }
        }
    }

    private static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
