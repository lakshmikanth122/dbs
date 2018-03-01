package com.capgemini.hackerrank;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class SherlockAndSquares {

	    static int squares(int a, int b) {
	        int value=0;
	        float ffloat=0.0f;
	        int count =0;
	        for(int i=a;i<=9;i++)
	        {
	         value=(int) Math.sqrt(i); 
	         ffloat =(float) Math.sqrt(i);
	            if((float)value == ffloat)
	            {
	                count++;
	            }

	        }
			return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int result = squares(a, b);
	            System.out.println(result);
	        }
	        in.close();
	    }

}
