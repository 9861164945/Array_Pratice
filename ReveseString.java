package com.pratice.ArrayQuestion;
import java.util.*;
public class ReveseString 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter a String");
		String str=sc.nextLine();
		String revstr="";
		for(int i=str.length()-1; i>=0;i--) 
		{

			revstr+=str.charAt(i);
		}
		
		System.out.println("Reverse String: "+revstr);
		
	
		sc.close();
	}
	

}
