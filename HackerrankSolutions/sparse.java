package com.capgemini.hackerrank;

import java.util.*;

public class sparse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        String val[]=new String[N];
        for(int i=0;i<N;i++)
        {
            val[i]=scan.next();
        }
        int N1 =scan.nextInt();
        String val1[]=new String[N1];
        for(int i=0;i<N1;i++)
        {
            val1[i]=scan.next();
        }
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<N1;i++)
        {int count=0;
            for(int j=0;j<N;j++)
            {
                if(val1[i].equals(val[j]))
                {
                    count++;
                }
            }
         ll.add(count);
        }
        ll.stream().forEach(x->System.out.println(x));
        
        
    }
}