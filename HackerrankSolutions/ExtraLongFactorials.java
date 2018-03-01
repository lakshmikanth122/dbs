package com.capgemini.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {
        BigInteger fact=new BigInteger("1");
        for(int i=n;i>0;i--)
        {
          fact=fact.multiply(new BigInteger(""+i));  
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
