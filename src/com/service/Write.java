package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write {
	
	Scanner sc= new Scanner(System.in);
	
	public void writeIntoFile() {
		
		File file = new File("C:\\Users\\doula\\Documents\\NotesApp\\ReadAndWrite1.txt");
		FileOutputStream f=null;
		try {
			f= new FileOutputStream(file);
			
			String s=sc.nextLine();
			
			f.write(s.getBytes());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			try {
				sc.close();
				f.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
