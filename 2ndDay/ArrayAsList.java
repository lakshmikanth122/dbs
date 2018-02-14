package com.capgemini.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayAsList {
  
public static void main (String args[]) {

      // create an array of strings
      String a[] = new String[]{"abc","klm","xyz","pqr"};

      List<String> list1 = Arrays.asList(a);
        Collections.sort(list1);
      // printing the list
      System.out.println("The list is:" + list1);
   }
}