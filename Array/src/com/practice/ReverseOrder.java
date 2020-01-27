package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		//*******************************************Using String************************
		/*String str = "Innvoation is life";  
		char strrev[]=new char[str.length()];
		int j=str.length()-1;
		int i=0;
		//for( int i=str.length()-1;i>=0;i--) {
		
		    while(j>=0) {
				strrev[i]=str.charAt(j);
				j--;
				i++;
			}
	    //}
	    
		for (char c : strrev) {
			System.out.print(c);
		}*/
	// *************************************************Using Int ***************************	
		/*int num;
		int rnum = 0;
		int a=0;
		System.out.println("Entry the Number:");
        Scanner p=new Scanner(System.in);
        num=p.nextInt();
        while(num!=0)
        {
        	a=num%10;
        	rnum=(rnum*10)+a;
        	num=num/10;
        }
       System.out.println("Number :- "+rnum);*/
       
		//***************************************************String builder***********************
		
		String str = "Innvoation is life";
		StringBuilder builder=new StringBuilder();
		builder.append(str);
		System.out.println(builder.reverse());
		
	}
}