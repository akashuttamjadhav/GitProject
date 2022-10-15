package com.velocity.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Integer> primeNumberList=new LinkedList<Integer>();
		primeNumberList.add(2);
		primeNumberList.add(3);
		primeNumberList.add(5);
		primeNumberList.add(7);
		
		//Using Iterator
		Iterator<Integer> itr=primeNumberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Using for each
		for(Integer num : primeNumberList) {
			System.out.println(num);
		}


	}

}
