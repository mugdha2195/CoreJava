package com.mugdha2195.Exercise;

public class Parenthesis {

	private boolean find(String array) {
		int count = 0;
		for (int i = 0; i < array.length(); i++) {
			char ch = array.charAt(i);
			if (ch == '(') {
				count++;
			} 
			else if (ch == ')') {
				count--;
				if (count < 0) {
					return false;
				}
			} else {
				throw new IllegalArgumentException("Invalid character: " + ch);
			}
		}
		return (count == 0);
	}

	public static void main (String args[]) {
		Parenthesis p = new Parenthesis();
		String s="(((((";
		System.out.println(p.find(s));
			
	}
	
}
