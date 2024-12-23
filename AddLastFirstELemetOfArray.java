/*

*/
import java.util.*;
class AddLastFirstELemetOfArray
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the size of the Array:");
        int n=sc.nextInt();
    
        int arr[]=new int[n];
        
        System.out.println("Enter"+ n +"Element into the Given Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int start=0;
        int end=n-1;
        int sum=arr[start]+arr[end];
        
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of  1st and Last Index is::"+sum);
       
    }
}