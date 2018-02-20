package com.capgemini.hackerrank;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class HackerRank2CamelCase {

	    static int camelcase(String s) {
	        int i=0;
	        for(String s1:s.split("[A-Z]"))
	        {
				
	            i++;
	        }
	        return i;
	        // Complete this function
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int result = camelcase(s);
	        System.out.println(result);
	        in.close();
	    }
	
}
