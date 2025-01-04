// Find Second Smallest and Second Largest Element in an array


// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Examples
// Example 1:
// Input:
//  [1,2,4,7,7,5]
// Output:
//  Second Smallest : 2
// 	Second Largest : 5
// Explanation:
//  The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

// Example 2:
// Input:
//  [1]
// Output:
//  Second Smallest : -1
// 	Second Largest : -1
// Explanation:
//  Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
  
  
  
  import java.util.*;

  public class secondlargestandsmallest {
    public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
if(n>3){

for(int i=0;i<n;i++){
    Scanner Sc=new Scanner(System.in);
    arr[i]=sc.nextInt();
}
}else {
    System.out.print(" Input size should be greater than 3");
}

System.err.println("second largest:"+secondlargest(arr));
System.err.println("second smallest:"+secondSmallest(arr));
    }

    public static int secondSmallest(int arr[]) {
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
               secondmin=min;
               min=arr[i];
            }
            else if(arr[i]<secondmin&&arr[i]!=min){
                secondmin=arr[i];
            }
        }
        return secondmin;
    }
    public static int secondlargest(int arr[]) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax&&arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
}
