package org.ddongq.ex;

public class Ex03_PersonMain {
	public static void main(String[] args) {
		
		Ex03_Person woman = new Ex03_Person();
		Ex03_Person man = new Ex03_Person("바트심슨", 83, 153.3, '남');
		
		woman.setAge(29);
		woman.setGender('여');
		woman.setHeight(163.5);
		woman.setName("아영");
		
		System.out.println(woman.getName());
		System.out.println(woman.getAge());
		System.out.println(woman.getHeight());
		System.out.println(woman.getGender());
		
		System.out.println("--------------");
		
		System.out.println(man.getName());
		System.out.println(man.getAge());
		System.out.println(man.getHeight());
		System.out.println(man.getGender());

	}
}
