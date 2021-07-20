package com.example;

import java.io.Closeable;

class FileManager implements Closeable {

	public void init(String filePath) {
		System.out.println("Filemanager::init");
	}

	public void readOrWrite() {
		System.out.println("FileManager::readOrWrite");
		if (System.currentTimeMillis() % 2 == 0) {
			throw new IllegalStateException("oops");
		}
	}

	public void close() {
		System.out.println("FileManager::close");
	}

}

public class Example3 {

	public static void main(String[] args) {

//		FileManager fileManager = new FileManager();
//		try {
//			fileManager.init("/file");
//			fileManager.readOrWrite();
//			return;
////			fileManager.close();
//		} catch (IllegalStateException e) {
////			fileManager.close();
//			System.out.println("Ex: " + e.getMessage());
//		} finally {
//			fileManager.close();
//		}

		// - or -

		// JDK 1.7 : Auto closable resource
		try (FileManager fileManager = new FileManager()) {
			fileManager.init("/file");
			fileManager.readOrWrite();
			return;
		} catch (IllegalStateException e) {
			System.out.println("Ex: " + e.getMessage());
		}

	}

}
