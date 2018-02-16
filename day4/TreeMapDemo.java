package com.capgemini.collections;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;
public class TreeMapDemo {

   public static void main(String args[]) {
      // Create a hash map
      TreeMap<String,Double> tm = new TreeMap<>();
      
      // Put elements to the map
      tm.put("Zara", new Double(3434.34));
      tm.put("Mahnaz", new Double(123.22));
      tm.put("Ayan", new Double(1378.00));
      tm.put("Daisy", new Double(99.22));
      tm.put("Qadir", new Double(-19.08));
      
      // Get a set of the entries
      Set<java.util.Map.Entry<String, Double>> set = tm.entrySet();
      
      // Get an iterator
      Iterator<java.util.Map.Entry<String, Double>> i = set.iterator();
      
      // Display elements
      while(i.hasNext()) {
         java.util.Map.Entry<String, Double> me = i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      
      // Deposit 1000 into Zara's account
      double balance = tm.get("Zara").doubleValue();
      tm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + tm.get("Zara"));
   }
}