package org.ddongq.test;

public class DogMain {
	public static void main(String[] args) {
		
		Dog dog_1 = new Dog();
		dog_1.setDog("알콩", 17);
		dog_1.info();
		
		Dog dog_2 = new Dog();
		dog_2.setDog("달콩", 20, "시츄");
		dog_2.info();
		
	}
}
