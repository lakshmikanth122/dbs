package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {// mising some test cases

	static int pairs(int k, int[] arr) {
		int count = 0;
		int val;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				val = Math.abs(arr[i] - arr[j]);
				if (val == k) {
					count++;
				}
			}
		}

		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = pairs(k, arr);
		System.out.println(result);
		in.close();
	}

}
