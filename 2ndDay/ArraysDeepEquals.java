package com.capgemini.arrays;

import java.util.Arrays;

public class ArraysDeepEquals {

	public static void main(String[] args) {

		// initializing Object array1
		Object[] b1 = new Object[] { 'a', 'b' };

		// let us print all the values available in array2
		System.out.println("Elements of Array1 is:");
		for (Object value : b1) {
			System.out.println("Value = " + value);
		}

		// initializing Object array2
		Object[] b2 = new Object[] { 'a', 'b' };

		// let us print all the values available in array2
		System.out.println("Elements of Array2 is:");
		for (Object value : b2) {
			System.out.println("Value = " + value);
		}

		// initializing Object array3
		Object[] b3 = new Object[] { 'x', 'y' };

		// let us print all the values available in array3
		System.out.println("Elements of Array3 is:");
		for (Object value : b3) {
			System.out.println("Value = " + value);
		}

		// checking array1 and array2 for equality
		System.out.println("Array1 and Array2 are equal:" + Arrays.deepEquals(b1, b2));

		// checking array1 and array3 for equality
		System.out.println("Array1 and Array3 are equal:" + Arrays.deepEquals(b1, b3));
	}
}
