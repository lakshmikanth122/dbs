package com.capgemini.arrays;
import java.util.Arrays;
public class CopyOfRange {
   public static void main(String[] args) {

      // intializing an array arr1
      int[] arr1 = new int[] {5, 62, 15};

      // printing the array
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);  
      }

      // copying array arr1 to arr2 with range from index 2 to 6
      int[] arr2 = Arrays.copyOfRange(arr1, 2, 6);

      // printing the array arr2
      System.out.println("Printing new array:");
      for (int i = 0; i < arr2.length; i++) {
         System.out.println(arr2[i]);
      }
   }
}

