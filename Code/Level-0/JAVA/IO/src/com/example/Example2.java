package com.example;

import java.io.File;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args)throws IOException,InterruptedException {

		File file=new File("./");
//		System.out.println(file.isDirectory());
		
//		String[] files=file.list();
//		for(String f:files) {
//			System.out.println(f);
//		}
		
		
		String[] textFiles=file.list((dir,name)->name.endsWith(".txt"));
		
		for(String f:textFiles) {
			System.out.println(f);
		}

		
		
	}
	

}
