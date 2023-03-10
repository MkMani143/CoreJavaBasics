package com.classesAndObjects;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double currency = new Double (9876543.21); 
		Locale currentLocale = Locale.US;
		NumberFormat currencyFormatter;
		currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		//System.out.println("Check"+currencyFormatter);
		String currencyOut;
		currencyOut = currencyFormatter.format(currency); 
		System.out.println(currencyOut + " "+currentLocale.toString());
		 		Double percent = new Double (0.75);
		NumberFormat percentFormatter; 
		String percentout;
		percentFormatter = NumberFormat.getPercentInstance(); 
		percentout = percentFormatter.format(percent);
		System.out.println(percentout);
	}

}
