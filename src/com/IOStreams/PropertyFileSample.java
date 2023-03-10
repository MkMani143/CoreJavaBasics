package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties connProp = new Properties();
		connProp.setProperty("username","trg08");
		connProp.setProperty("password","trg08");
		FileOutputStream propsFiles= new FileOutputStream("Informations.properties");
		connProp.store(propsFiles,"Properties File");
		propsFiles.close();
		
		String username=null;
		String password=null;
		Properties tempProp = new Properties();
		FileInputStream obtained= new FileInputStream("Information.properties");
		tempProp.load(obtained);
		propsFiles.close();
		
		username=tempProp.getProperty("username");
		password=tempProp.getProperty("password");
		System.out.println(username+" "+password);

	}

}
