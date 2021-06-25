package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader(new File("./Notes.txt")); // stream opened

//			int ch = -1;
//			while ((ch = fr.read()) != -1) {
//				System.out.print((char) ch);
//			}

			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
