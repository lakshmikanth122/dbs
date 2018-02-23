package com.capgemini.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(18);
        System.out.println(IntStream.range(0, 50).summaryStatistics());
        int []array= {1,4,5,65,77,89,90};
        System.out.println(IntStream.of(array).summaryStatistics());
	}

}
