package com.capgemini.collections;

import java.util.*;
import java.util.stream.Stream;
public class ArrayListDemo {

   public static void main(String args[]) {
      // create an array list
      ArrayList<String> al = new ArrayList<>();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);
      List<String> lll=new ArrayList<>();
      lll=(List<String>) al.clone();
      List<String> llll=new ArrayList<>(al);
      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      System.out.println("Contents of al with index of D: " + al.indexOf("D"));
      Object[] liss= al.toArray();
      Stream.of(liss).forEach(System.out::print);
      System.out.println();
      Object[] j=liss.clone();
      Stream.of(j).forEach(System.out::print); System.out.println();
      System.out.println("Contents of lll: " + lll);
      System.out.println("Contents of llll: " + llll);
   }
}