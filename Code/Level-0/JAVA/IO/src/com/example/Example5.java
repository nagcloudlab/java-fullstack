package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) {
		
		
		try {
			
			File file=new File("/Users/nag/Downloads/RevaturePro _ Java Full stack _Angular.pdf");
			FileInputStream fis=new FileInputStream(file);
			byte[] binaryData=new byte[(int)file.length()];
			fis.read(binaryData);
			fis.close();
			
			File backupFile=new File("./backup.pdf");
			FileOutputStream fos=new FileOutputStream(backupFile);
			fos.write(binaryData);
			fos.close();
			
			
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
