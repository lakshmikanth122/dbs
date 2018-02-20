package com.capgemini.hackerrank;

import java.util.*;

public class HackerRankInAString {
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0) 
            return true;
        if (n == 0) 
            return false;
             
        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);
 
        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }
    static String hackerrankInString(String str2) {
        String str1="hackerrank";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        if(res)
            return "YES";
        else
            return "NO"; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
