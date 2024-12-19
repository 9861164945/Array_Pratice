package com.pratice.ArrayQuestion;
import java.util.Scanner;
public class PalindromeString 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		 String revstr="";
		 for(int i=str.length()-1;i>=0;i--)
		 {
	            revstr+=str.charAt(i);
	        }
	        System.out.println("After Reversing the String is :"+revstr);
	        if (revstr.equalsIgnoreCase(str)) 
	        {
	            System.out.println("Palindrome String");
	        } else 
	        {
	            System.out.println("Not a Palindrome String");
	        }
		
	        sc.close();
	}

}
