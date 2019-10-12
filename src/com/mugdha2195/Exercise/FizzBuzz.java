package com.mugdha2195.Exercise;  

public class FizzBuzz {
	public static void main(String args[]) {
	for (int i=1;i<=100;i++) {
		boolean a1,a2,a3;
		a1=(i%3 == 0);
		a2=(i%5 ==0);
		a3=(i%10 == 0);
		 if(a1 && a2)
			System.out.printf("FizzBuzz"+"\t");
		else if(a2)
			System.out.printf("Buzz"+"\t\t");
		else if(a1)
			System.out.printf("Fizz"+"  \t");
		else 
			System.out.printf(i+"\t");
		 if(a3)
			 System.out.println();
		}
	}
}

