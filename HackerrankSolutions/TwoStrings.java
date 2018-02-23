package com.capgemini.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String a, String b){
         Set<Character> aLetterSet = new HashSet<>();
            Set<Character> bLetterSet = new HashSet<>();
            
            //Populate the sets
            for(int i = 0; i < a.length(); i++)
                aLetterSet.add(a.charAt(i));
            
            for(int i = 0; i < b.length(); i++)
                bLetterSet.add(b.charAt(i));
            
            //Perform the intersection of the two sets
            aLetterSet.retainAll(bLetterSet);
        //System.out.println("aLetterSet"+aLetterSet);
                
            if(aLetterSet.size() > 0)
                return "YES";
            else
               return "NO"; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
