package com.capgemini.day3Java8;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,5,2,3,4,5};
		int result=0;
		for(int i:arr)
		{
			result ^=i;
		}
		System.out.println("Result= "+result);
	}

}
