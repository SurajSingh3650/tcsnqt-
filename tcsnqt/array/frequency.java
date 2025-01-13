/*Count frequency of each element in the array


294

6
Problem statement: Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array*/



package tcsnqt.array;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          Scanner Sc=new Scanner(System.in); 
          arr[i]=sc.nextInt();

        }
   
solution1(arr, n);

    }
    public static void solution1(int num[], int n){
        boolean visted[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visted[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    count++;
                    visted[j]=true;
                }
            }
            System.out.println(num[i]+" "+count);

        }

    }
}
