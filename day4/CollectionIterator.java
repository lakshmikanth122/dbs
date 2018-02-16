package com.capgemini.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Comparatorrr implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
}
public class CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists=new ArrayList<>();
		lists.add("Java");
		lists.add("C");
		lists.add("C++");
		lists.add("PERL");
		lists.add("PHP");
		lists.add("PYTHON");
		lists.add("ANGULAR");
		Iterator<String> itr= lists.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" | ");
			
		}
		Collections.shuffle(lists);
		System.out.println(lists);
		for(String s:lists)
		{
			System.out.println(s);
		}
		ListIterator<String> li=lists.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next()+"     NEXT");
			//System.out.println(li.previous()+" PREVIOUS");
		}
		
		
	}

}
