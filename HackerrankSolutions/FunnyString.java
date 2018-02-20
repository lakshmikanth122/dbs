package com.capgemini.hackerrank;

import java.util.*;

public class FunnyString {

    private static Scanner in;

	static String funnyString(String s){
         for(int j = 1; j < (s.length()/2)+1; j++)
            {
                int left = Math.abs(s.charAt(j) - s.charAt(j-1));
                int right = Math.abs(s.charAt(s.length()-1-j) - s.charAt(s.length()-j));
                if( left != right)
                {
                    return "Not Funny";
                    
                }
            }
           return "Funny";
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
