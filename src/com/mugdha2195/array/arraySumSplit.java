package com.mugdha2195.array;
import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class arraySumSplit {
	
	
	private int check(int[] integers) {
		int i,j,rsum=0,lsum=0,n;
		n=integers.length;
		for( i=0;i<n;i++)
			lsum=lsum+ integers[i];
		for( i=1;i<=n;i++) {
			j=n-i;
			rsum=rsum+integers[j];
			lsum=lsum-integers[j];
			if(lsum == rsum) 
				return j;
		}
		return -1;
		
		}
	
	private void sort(int[] array) {
		int n=array.length;
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
	

	private  int check1(int[] array) {
		int i,j,min,rsum=0,lsum=0,n;
		n=array.length;
		for( i=0;i<n;i++)
			lsum=lsum+ array[i];
		for( i=1;i<=n;i++) {
			j=n-i;
			rsum=rsum+array[j];
			lsum=lsum-array[j];
			min=lsum-rsum;
			System.out.println(min+" ==min \n");
			if(min<=0) {
			if(lsum == rsum || lsum>= min) { 
				//System.out.println(min+" ==min \n"+lsum+"== lsum\n  "+ rsum+"==rsum");
				return j;	
			}
				if(min<=0) 
				break;
			}
		}
		return -1;
	}
		
	
	public static void main(String args[]) {
		arraySumSplit as= new arraySumSplit();
		int x=0;
		int[] integers= {5,3,8,4,9,4,-9,2,1,5};
		//as.sort(integers);	
		System.out.println(" Array numbers => "+Arrays.toString(integers));
		
		x=as.check(integers);
			
		System.out.println("spilt index=> "+x+"  ");
	
	}

}
