package com.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Animal 
{
    public static void space(int i)
    {
    	int temp = 5-i;
    	if(temp!=0)
    	{
    	System.out.print(" ");
    	space(temp);
    	temp--;
    	}
    	
    }
	
	public static void main(String[] args) {
		
		String s ="*";
		String space=" ";
		
		for(int i=1 ;i<=4 ;i++)
		{
			space(i);
			s=s+"*";
			
			System.out.println(s);
		}
	}
	
}
