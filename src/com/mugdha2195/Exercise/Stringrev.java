package com.mugdha2195.Exercise;

public class Stringrev {
	public static void main(String args[]) {
	String s="happy are you?";
	int len = s.length()-1;
	StringBuilder ab=new StringBuilder();
	for(int i=len; i>= 0; --i) {
	   ab.append(s.charAt(i)); 
	  } 
	  System.out.println(ab.toString());
	
	}
}
