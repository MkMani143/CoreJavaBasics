package com.classesAndObjects;

public class kid {
		
		String name;
		int age;
		public kid(String name,int age) {
			this.name=name;  // Instance variable
			this.age=age;
		}
		public void play() {
			System.out.println(this.name+" is playing..");
		}

		//METHOD OVERLOADING
		
		public void printkid(String name) {
			System.out.println("Name of kid is..."+this.name+"and Age is..."+this.age);
		}
		public void printkid(int studying) {
			System.out.println("Kid is studying in : "+studying);
		}
		public void printkid(String name,int age) {
			System.out.println("Kid is studying: ");
		}
		
	

}
