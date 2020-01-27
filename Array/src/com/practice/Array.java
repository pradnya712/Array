package com.practice;

import java.util.Scanner;

public class Array {
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
	/*int num=(int)(Math.random()*100);
	System.out.println(num);*/
	
	// System.out.println("out line");
	// \u000d System.out.println("comment");
	}
	
}
