package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SimpleArraylist {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(5);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.println("Enter country name or enter 'e' to exit");
				String input =reader.readLine();
				
				if(input.equalsIgnoreCase("e")) {
					break;
				}else {
					list.add(input);
				}
					
				
			} catch (Exception e) {
				 System.out.println(e);
			}
		}
		System.out.println(list);
		
		
		
	}
}
