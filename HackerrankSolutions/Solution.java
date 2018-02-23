package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       List l= new ArrayList();
        for(int i=0;i<n;i++)
        {
           //array[i]=sc.nextInt(); 
            l.add(sc.nextInt());
        }
        //System.out.println(array[1]);
       Collections.reverse(l);
       Stream.of(l).forEach(x->System.out.print(x+" "));
    }
}