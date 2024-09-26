package com.demo;

public class Int_Program {

	public static void main(String[] args) {
		
		
	  int ar[] = {1, 4, 0, 6, 7, 8, 0, 9, 8};
	  
	  for(int i = 0 ; i < ar.length ; i++)
	  {
		  for(int j = i+1 ; j<ar.length ; j++)
		  {
			  if(ar[i]==0)
			  {
			    int temp = ar[i];
			    ar[i] = ar[j];
			    ar[j] = temp;
			  }
		  }
	  }
	
	  for(int i = 0; i<ar.length; i++)
	  {
		  System.out.println(ar[i]);
	  }
	}
}
