package com.velocity.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Pawan");
		nameList.add("Karan");
		nameList.add("Ram");
		nameList.add("Sham");
		
		//Using Iterator
		Iterator<String> itr=nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Using for each
		for(String name : nameList) {
			System.out.println(name);
		}

	}

}
