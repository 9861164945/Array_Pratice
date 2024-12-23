/*

*/
import java.util.*;
class FindMiddleElementsOfArray
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
        int mid=(start+end)/2;
        if(n%2!=0)
        {
            System.out.println("The Middle Element is "+arr[mid]);
            
        }
        else
        {
           System.out.println("The Middle ELements Are "+arr[mid]+"and "+arr[mid-1]); 
        }
        
        
        System.out.println(Arrays.toString(arr));
       
    }
}