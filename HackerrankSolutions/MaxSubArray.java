package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MaxSubArray {

	    static long maximumSum(long[] a, long m) {
	    	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        for(int i=0;i<a.length;i++)
	        {
	        	for(int j=i;j<a.length;j++)
		        {long sum=0;
		        int k=j;
		        	if(k!=-1)
		        	{
		        		while(k<a.length)
		        		{
		        			if(k!=-1)
				        	{
		        			sum+=a[k];
		        			k--;
				        	}
		        			break;
		        		}
		        		arrayList.add((int) (sum % m));
		        	}
	        	//arrayList.add((int) (a[i] % m));
		        }
	        }
			return Collections.max(arrayList);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            long m = in.nextLong();
	            long[] a = new long[n];
	            for(int a_i = 0; a_i < n; a_i++){
	                a[a_i] = in.nextLong();
	            }
	            long result = maximumSum(a, m);
	            System.out.println(result);
	        }
	        in.close();
	    }
	}
