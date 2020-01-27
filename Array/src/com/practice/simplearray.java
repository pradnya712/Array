package com.practice;

import java.util.Scanner;

public class simplearray {
	public static void main(String []args)
	{
		int total = 0;
		int percentage=0;
		int max=0;
		int[]marks=new int[5]; 
		
		Scanner scan=new Scanner(System.in);
	    for(int i=0;i<marks.length;i++){
	    	System.out.println("Enter the marks");
	    	marks[i]=scan.nextInt();
		}
		for(int mark:marks)
		{
			if(max<mark) {
				max=mark;
			}				
			System.out.print("\t"+mark);
			total=total + mark;
			
		}
		percentage=(total/5);
		int min = marks[0];
		for(int i=1;i<marks.length;i++){
			if(marks[i]< min){
			  min=marks[i];
		 }
		}
		System.out.println("\n"+"total ="+total);
		System.out.println("\n"+"percentage ="+percentage);
		System.out.println("\n"+"max ="+max);
		System.out.println("\n"+"min ="+min);
}
}	

