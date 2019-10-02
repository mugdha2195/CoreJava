package com.mugdha2195.array;


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
	
	public static void main(String args[]) {
		arraySumSplit as= new arraySumSplit();
		int x=0;
		int[] integers= {8,4,12,7,0,-2,5,6,8};
		System.out.println(" Array numbers ");
		for(int i=0;i<integers.length;i++)
			System.out.print(integers[i]+", ");
		x=as.check(integers);
		System.out.println("  ");			
		System.out.println("spilt index=> "+x+"  ");
	
	}

}
