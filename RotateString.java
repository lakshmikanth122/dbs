package com.capgemini.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RotateString {
	public static void main(String[] args) {    
	    Scanner in = new Scanner(System.in);
	    String first = null;
	    Map<Character, Character> map = new HashMap<Character, Character>();
	    int diff = 'z' - 'a';
	    StringBuffer second = new StringBuffer();
	    for (int i = 'a'; diff >= 0; i++) {
	        char c = (char) i;
	        char c1 = (char) (i + diff);

	        map.put(c, c1);
	        map.put(c1, c);
	        diff -= 2;
	    }
	        diff = 'z' - 'a';
	    for (int i = 'A'; diff >= 0; i++) {
	        char c = (char) i;
	        char c1 = (char) (i + diff);

	        map.put(c, c1);
	        map.put(c1, c);
	        diff -= 2;
	    }
	    System.out.println("Enter your string ");
	    first = in.nextLine();

	    for (int i = 0; i < first.length(); i++) {
	        second.append(map.get(first.charAt(i)));
	    }
	    System.out.println("Rotated string is " + second.toString());
	}
}
