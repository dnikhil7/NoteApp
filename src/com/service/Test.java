package com.service;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Write w=new Write();
		ReadFile r=new ReadFile();
		
		System.out.println("* Welcome to NoteApp *");
		
		System.out.println(" ");
		
		System.out.println("Please enter 1 to write the note: ");
		System.out.println("Please enter 2 to read the note: ");
		
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1 :
			System.out.println("Write something and enter -1 to save the note: ");
		     w.writeIntoFile();
		     break;
		case 2 :
			r.readFile();
		}
		
	}

}
