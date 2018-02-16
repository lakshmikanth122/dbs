package com.capgemini.collections;

import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      // ArrayList 
      List<String> a1 = new ArrayList<>();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      Collections.sort(a1);
      System.out.print("  Sorting \t" + a1);

      // LinkedList
      List<String> l1 = new LinkedList<>();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      l1.addAll(a1);
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
      Collections.sort(l1);
      System.out.print("  Sorting \t" + l1);
      System.out.println(l1.get(5));
      System.out.println(l1.contains("Zara"));
      System.out.println(l1.addAll(0, a1));//adding at 0 th index position 
      System.out.print("   \t" + l1);
      System.out.println(l1.iterator().next());
      Collections.swap(l1, 0, 5);
      System.out.println(l1+"Swapping using collections");
      l1.remove("Zara");
      System.out.println(l1);

      // HashSet
      Set<String> s1 = new HashSet<>(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map<String,Integer> m1 = new HashMap<>(); 
      m1.put("Zara", 8);
      m1.put("Mahnaz", 31);
      m1.put("Ayan", 12);
      m1.put("Daisy", 14);
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      System.out.print("\t" + m1.remove("Zara"));
   }
}
