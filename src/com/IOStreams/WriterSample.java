package com.IOStreams;

import java.io.FileWriter;

public class WriterSample {

	public static void main(String[] args) {
		String data = "This is the data in the output file";
		try {
			FileWriter output = new FileWriter("D:\\SDET Training WS\\CoreJavaBasics\\src\\com\\IOStreams\\output.txt");
			output.write(data);
			output.flush();
			output.close();
			output.append("....");
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}

	}

}
