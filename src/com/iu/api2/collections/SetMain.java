package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		Iterator<Integer> is = hs.iterator();
	
		while(is.hasNext()) {
			Integer num= is.next();
			System.out.println(num);
		}
	}
}
