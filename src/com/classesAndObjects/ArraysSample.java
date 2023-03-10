package com.classesAndObjects;

public class ArraysSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and initialize the array
		int[] age= {1,2,3,4,5};
		System.out.println(age.length);
		
		//access each array elements
		System.out.println("Accessing Elements of Array: ");
		System.out.println("1st Element: "+age[0]);
		System.out.println("2nd Element: "+age[1]);
		System.out.println("3rd Element: "+age[2]);
		System.out.println("4th Element: "+age[3]);
		System.out.println("5th Element: "+age[4]);
		
		//loop through the array
		//using for loop
		System.out.println("Using for loop: ");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		//using for each loop
		System.out.println("Using for-each loop: ");
		for(int a:age) {
			System.out.println(a);
		}
		
		//access all elements using for each loop
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		double average;
		//add each element in sum
		for(int number:numbers) {
			sum+=number;
		}
		
		
		//get the total number of elements
		int arrayLength =numbers.length;
		
		//calculate the average
		//convert the average from int to double
		average=((double)sum/(double)arrayLength);
		
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+average);
		
		//create 2D array
		int[][] a= {
				{1,2,3},
				{4,5,6,7},
				{8},};
		
		//calculate the length of each row
		System.out.println("1st row length: "+a[0].length);
		System.out.println("2nd row length: "+a[1].length);
		System.out.println("3rd row length: "+a[2].length);
	}

}
