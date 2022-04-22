package com.edu;

public class Maximum {

	public static void main(String[] args) {
		int ar[]=new int[5];  //declaration
		ar[0]=34;  //ar->subscript  0->index
		ar[1]=37;
		ar[2]=56;
		ar[3]=78;
		ar[4]=12;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		                     
		
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
 System.out.println("Enter of all element is="+max);
	}

}
