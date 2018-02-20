package com.capgemini.collections;

import java.util.Stack;
import java.util.stream.Stream;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s=new Stack<>();
		s.add("array");
		s.push("add");
		s.add("array");
		s.push("add");
		Stack<String> c=new Stack<>();
		c.addAll(s);
		//c.add("aaa");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		Stream.of(s).spliterator();
		System.out.println(s.pop()+s);
		System.out.println(s.peek()+s);
		int sze=s.size();
		System.out.println(sze);
		System.out.println(s.elementAt(0));
		System.out.println(s.capacity());
		System.out.println(s.contains("add")+"smldhs");
		System.out.println(s.retainAll(c));
		System.out.println(c);
		s.clear();
		System.out.println(s+"   j fdghjhbndb          hdgjhdgjhfd");
	}

}
