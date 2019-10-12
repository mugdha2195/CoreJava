package com.mugdha2195.Exercise;

import java.util.ArrayList;

public class DuplicateArray {
	
	public void sort(int[] array,int n) {
		for (int q=0;q<n;q++) {
			for(int w=(q+1);w<n;w++) {
				if(array[q]>array[w]) {
					int g= array[q];
					array[q]=array[w];
					array[w]=g;
				}
			}
			
		}
	}
	
	public ArrayList sort1(int[] array,int n) {
		ArrayList n1=new ArrayList();
		int a=array[0];
		n1.add(array[0]);
		for (int q=1;q<n;q++) {
			if(array[q] != a) { 
				a=array[q];
			//n1.add(array[q]);// returns array with no duplicates
			}
			else 
				n1.add(array[q]); //returns duplicate array elements.
		}
		return n1;
	}
	
	
}
