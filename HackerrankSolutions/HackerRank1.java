package com.capgemini.hackerrank;

import java.util.*;

public class HackerRank1 {

   public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    StringBuilder sb =new StringBuilder(in.nextLine());

		   for (int i=0; i<sb.length()-1; i++){
		        if(sb.charAt(i)==sb.charAt(i+1)){
		            sb.delete(i, i+2);
		            i=-1;

		     }
		    }
		    if(sb.length()==0){
		        System.out.println("Empty String");
		    }else{
		        System.out.println(sb);
		    }
		   }
}
