package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindMedian {

    static int findMedian(int[] numArray) {
       Arrays.sort(numArray);
int median;
if (numArray.length % 2 == 0)
    median = (numArray[numArray.length/2] + numArray[numArray.length/2 - 1])/2;
else
    median = numArray[numArray.length/2];
        
    return median;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }
}
