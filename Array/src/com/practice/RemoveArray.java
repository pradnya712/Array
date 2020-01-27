 package com.practice;

import java.util.Scanner;

public class RemoveArray {

	public static void main(String[] args) {
		
		System.out.println("Enter array size");
		int n = (new Scanner(System.in)).nextInt();
		int[] marks = new int[n];
		for(int i =0; i<marks.length;i++) {
			marks[i]=(int)(Math.random()*1000);
		}
		System.out.print("marks: ");
		for (int i : marks) {
			System.out.print(i+" ");
		}
		
		int mid=(marks.length-1)/2;
		
		System.out.println("\n"+  mid);
		
		int[] marks1=new int[mid];
		for(int i=0;i<mid;i++)
		{
		  marks1[i]=marks[i];
		
		}
		System.out.print("marks1: ");
		for (int i : marks1) {
			System.out.print(i+" ");
		}
		
		
		int[] marks2=new int[(marks.length-1)-mid];
		
		int i=mid+1;
		int j= 0;		
		while(i<marks.length) {
			marks2[j]=marks[i];
			j++;
			i++;
		}
		
		System.out.print("\nmarks2: ");
		for (int mark : marks2) {
			System.out.print(mark+" ");
		}
		
			
	}
}

