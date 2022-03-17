package org.ddongq.test;

public class DogMain {
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		myDog.setDog("알콩", 3);
		yourDog.setDog("달콩", 5, "시츄");
		
		myDog.info();
		System.out.println("-------------");
		yourDog.info();
		
	}
}
