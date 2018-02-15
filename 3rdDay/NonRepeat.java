package com.capgemini.day3Java8;

public class NonRepeat{
	   public static void main(String[] args) {
	    int[] a = {1,1,3,2,3};
	    int[] b =new int[a.length]; 
	    //instead of a.length initialize it to maximum element value in a; to avoid
	    //ArrayIndexOutOfBoundsException
	    for(int i=0;i<a.length;i++){
	      int x=a[i];
	      b[x]++;
	    }
	     for(int i=0;i<b.length;i++){
	       if(b[i]==1){
	       System.out.println(i); // outputs 2
	       break;
	       }
	     }
	   }
	}