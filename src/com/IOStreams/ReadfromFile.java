package com.IOStreams;

import java.io.FileReader;

public class ReadfromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr   = new char[100];
		try {
			FileReader input = new FileReader("D:\\SDET Training WS\\CoreJavaBasics\\src\\com\\IOStreams\\input.txt");
			input.read(arr);
			System.out.println("data in the File");
			System.out.println(arr);
			input.close();
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}
	}

}
