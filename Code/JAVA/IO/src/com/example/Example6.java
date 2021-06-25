package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example6 {

	public static void main(String[] args) throws IOException {

		File file = new File("Menu.txt");
		FileWriter fileWriter = new FileWriter(file, true); // open stream
//		fileWriter.write("item-1\n");
//		fileWriter.write("item-2\n");
//		fileWriter.write("item-3\n");
//		fileWriter.flush();
//		fileWriter.write("item-4\n");
//
//		fileWriter.close(); // flush + close stream
		
		
		PrintWriter pw=new PrintWriter(fileWriter);
		pw.println("item-11");
		pw.println("item-22");
		pw.close();

		System.out.println("Done");
		

	}

}
