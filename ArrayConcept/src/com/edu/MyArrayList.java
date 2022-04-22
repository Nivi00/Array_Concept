package com.edu;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("rani");
        list.add("kiran");
        list.add("swetha");
        list.add("ravi");
        
        list.add(2,"Tharani");//specified index
        System.out.println("get value in 3rd index "+list.get(2));
        
		System.out.println(list);//displaying list
		
		
		//integer ArrayList
		ArrayList<Integer> iob=new ArrayList<Integer>();
		//add element
				//display
		iob.add(11);
		iob.add(22);
		iob.add(33);
		iob.add(44);
		iob.add(55);
		
		System.out.println(iob);
		
		//add element
		//display
		
	
		
		ArrayList<Float> fob=new ArrayList<Float>();
		
		//add elements
		//display
		fob.add(4.5f);
		fob.add(2.3f);
		fob.add(2.8f);
		fob.add(2.3f);
		fob.add(2.9f);
		
		System.out.println(fob);
		
		
		ArrayList<Double> dob=new ArrayList<Double>();
		
          dob.add(22.11);
          dob.add(33.11);
          dob.add(44.11);
          dob.add(55.11);
          
          
          System.out.println(dob);
          dob.clear();
          System.out.println(dob);
	}

}
