package com.capgemini.hackerrank;

    import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class SherlockOnArray {

	    static String solve(int[] arr){
	    	int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        //curr is cimulated sum in the left
        int curr = 0;
        for(int j=0; j<arr.length; j++){
            //left part equals right part
            if(curr == sum - arr[j]-curr){
                return "YES";
            }
            curr += arr[j];
        }
        return "NO";
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int T = in.nextInt();
	        for(int a0 = 0; a0 < T; a0++){
	            int n = in.nextInt();
	            int[] a = new int[n];
	            for(int a_i=0; a_i < n; a_i++){
	                a[a_i] = in.nextInt();
	            }
	            String result = solve(a);
	            System.out.println(result);
	        }
	    }
	}

