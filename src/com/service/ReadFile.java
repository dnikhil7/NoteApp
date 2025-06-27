package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public void readFile() {
	File file = new File("C:\\Users\\doula\\Documents\\NotesApp\\ReadAndWrite1.txt");
	FileInputStream f=null;
	try {
		 f = new FileInputStream(file);
		int temp;
		while((temp=f.read())!=-1) {
			System.out.print((char)temp);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
 finally {
	 try {
		f.close();
	} catch (IOException e) {
		System.out.println(e);
	}
 }
	
}
	
}

