// Problem Statement: Given an array, we have to find the smallest element in the array.

// Examples:

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array.

import java.util.*;

public class smallest {
    public static void main(String[] args) {
    
        int n;
        Scanner Sc = new Scanner(System.in);

        n = Sc.nextInt();
     int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();

        }
        System.out.print("the smallest element in the arr:"+smallestelement(arr));

    }

    public static int smallestelement(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
