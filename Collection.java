package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		int a[]= new int[8];
		a[0]= 10;
		a[1]=10;
		a[2]=20;
		a[3]=50;
		a[4]=60;
		a[5]=80;
		a[6]=60;
		a[7]=50;

		Set<Integer> s = new LinkedHashSet<Integer>();
		
	for (int i = 0; i < a.length; i++) {
		s.add(a[i]);
		System.out.println(a[i]);	
		}
		System.out.println("After Removing Duplicate");
		
		for(Integer k:s)
			System.out.println(k);
		
	}	
}
