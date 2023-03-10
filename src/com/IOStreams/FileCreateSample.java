package com.IOStreams;

import java.io.File;
import java.io.IOException;

public class FileCreateSample {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\we");
		boolean  isDir = dir.mkdir();
		boolean val = false;
		String path = dir.getAbsolutePath();
//		System.out.println(path);
	    dir.exists();
		if(isDir) {
			File file = new File("D:\\we\\CoreJavaBasics.txt");
			val = file.createNewFile();
			if(file.exists()) {
				System.out.println(file.getAbsolutePath());
			}
			if(val) {
				System.out.println("The file is created");
			}
			else {
				System.out.println("File is not created");
			}
			
		}
	}

}
