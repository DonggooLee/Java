package org.ddongq.test2;

public class DogMain {
	public static void main(String[] args) {
		
		Dog dog_1 = new Dog();
		Dog dog_2 = new Dog();
		
		dog_1.setDog("알콩", 5);
		dog_2.setDog("알콩", "시츄", 8);
		
		dog_1.info();
		
		System.out.println("-----------");
		
		dog_2.info();
		
	}
}
