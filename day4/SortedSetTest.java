package com.capgemini.collections;

import java.util.*;
public class SortedSetTest {

   public static void main(String[] args) {
      // Create the sorted set
      SortedSet<String> set = new TreeSet<>(); 

      // Add elements to the set
      set.add("b");
      set.add("c");
      set.add("a");
      System.out.println(set.first( ));
      System.out.println(set.last());
      System.out.println(set.headSet("b"));
      // Iterating over the elements in the set
      Iterator<String> it = set.iterator();

      while (it.hasNext()) {
         // Get element
         Object element = it.next();
         System.out.println(element.toString());
      }
   }
}
