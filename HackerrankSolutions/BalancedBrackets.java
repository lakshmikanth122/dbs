package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

    static String isBalanced(String s) {
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb1=new StringBuffer(s);
        int count=0;
        for(int i=0;i<sb.length();i++)
        {
        	for(int j=0;j<sb.length();j++)
        	{
        		if(sb.charAt(i)==sb.charAt(j))
        		{
        			count++;
        		}
        	}
        }
        
		return (sb.length()==count ? "YES" :"NO");
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
