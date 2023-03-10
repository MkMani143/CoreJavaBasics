package com.IOStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromConsole {
	private static void process(String str) {
		System.out.println("Processing..."+str+"\n");
	}
	private static void doReadFromStdin(){
		try {
			BufferedReader inStream=new BufferedReader(new InputStreamReader(System.in));
			String inLine="";
			
			while(!(inLine.equalsIgnoreCase("quit")) && !(inLine.equalsIgnoreCase("exit"))){
				System.out.print("Prompt> ");
				inLine=inStream.readLine();
				process(inLine);
			}
		}
		catch(Exception e) {
			System.out.println("IO Exception: "+e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doReadFromStdin();
	}

}
