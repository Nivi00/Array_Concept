package com.edu;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Integer> tob = new TreeSet<Integer>();
		tob.add(11);
		tob.add(22);
		tob.add(33);
		tob.add(44);
		tob.add(55);
		
		System.out.println(tob);
		
		System.out.println("Acesending order");
     Iterator<Integer> it=tob.iterator();
     while (it.hasNext()) {
		System.out.println(it.next());
		
	}
     
     System.out.println("Desending order");
     Iterator<Integer> it1=tob.descendingIterator();
     while (it1.hasNext()) {
		System.out.println(it1.next());
		
	}
     
     
     TreeSet<String> tob2=new TreeSet<String>();
		tob2.add("Zeeba");
		tob2.add("Anil");
		tob2.add("Kiran");
		tob2.add("John");
		System.out.println(tob);
		
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<String> it2=tob2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//Descending order
		System.out.println("Descending order");
		Iterator<String> it3=tob2.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}


    
     }
	}


