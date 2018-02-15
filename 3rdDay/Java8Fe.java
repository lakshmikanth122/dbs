package com.capgemini.day3Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Fe {

	public static void main(String[] args) {
		int[] arr= {5,10,23,45,44};
		int sum=IntStream.of(arr).sum();
		OptionalInt rere= IntStream.range(1, 9).reduce((a,b)->a+b);
		System.out.println(rere.getAsInt());
		System.out.println("Sum is "+sum);
		
		List<Integer> list =new LinkedList<>();
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(8);
		list.add(4);
		int[] array=list.stream().mapToInt(i->i).toArray();
		System.out.println("ARRAY  "+Arrays.toString(array));
		
		List<Integer> list4=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list4.toString());
		System.out.println(Arrays.toString(arr));
		Collections.swap(list,2,3);
		System.out.println(list);
		System.out.println(Collections.frequency(list, 4));//counts the frequency in list of given number
		System.out.println(Collections.disjoint(list, list4));//if two list are different it will output true

	}

}
