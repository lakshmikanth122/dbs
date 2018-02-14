package com.capgemini.arrays;

import java.util.Arrays;

public class ArraysSort {
   public static void main(String[] args) {

      // initializing unsorted char array
      char cArr[] = {'r','q','s','p'};

      // let us print all the values available in list
      for (char value : cArr) {
         System.out.println("Value = " + value);
      }

      // sorting array
      Arrays.sort(cArr);

      // let us print all the values available in list
      System.out.println("The sorted char array is:");
      for (char value : cArr) {
         System.out.println("Value = " + value);
      }
   }
}