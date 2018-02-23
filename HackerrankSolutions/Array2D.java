package com.capgemini.hackerrank;

import java.io.*;
import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int j = n - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}
	}
}
