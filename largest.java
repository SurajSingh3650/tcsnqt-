// Problem Statement: Given an array, we have to find the largest element in the array.

// Examples
// Example 1:
// Input:
//  arr[] = {2,5,1,3,0};
// Output:
//  5
// Explanation:
//  5 is the largest element in the array. 

// Example2:
// Input:
//  arr[] = {8,10,5,7,9};
// Output:
//  10
// Explanation:
//  10 is the largest element in the array. 

import java.util.Scanner;

public class largest {
     public static void main(String[] args) {
    
        int n;
        Scanner Sc = new Scanner(System.in);

        n = Sc.nextInt();
     int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();

        }
        System.out.print("the largest element in the arr:"+largestelement(arr));

    }

    public static int largestelement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
