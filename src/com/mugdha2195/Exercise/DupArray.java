package com.mugdha2195.Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class DupArray {
	
	public static void main(String args[]) {
		DuplicateArray arr= new DuplicateArray(); 
		int a[]= {1,3,2,3,6,5,7,2,7,8,4,9};
		int n=a.length;
		arr.sort(a,n);		
		System.out.println(Arrays.toString(a));
		
		ArrayList n1=new ArrayList();
		n1=arr.sort1(a, n);
		System.out.println("Array =>"+n1);
		
	}
}
