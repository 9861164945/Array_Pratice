/*
Write a program to store array dynamically by reading the size 
 and elements from the user.
 Input as: 
 Enter size of the array:6
 Enter 6 elements: 1 2 3 4 5 6
 Output is: 
 Array elements are: 1 2 3 4 5 6

*/
import java.util.*;
class PrintDynamically
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter"+n+ "Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}