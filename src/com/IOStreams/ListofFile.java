package com.IOStreams;

import java.io.File;

public class ListofFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\");
		recursive(dir);

		}
	
	public static void recursive(File filename) {
	boolean dirornot = filename.isDirectory();
	
		if(dirornot) {
		File[] arr = filename.listFiles();
		for(File file:arr) {
			System.out.println("File:  "+file.getName());
			recursive(file);
		}
		
	}
		else {
		System.out.println("Not a directory");
	}
	}

}
