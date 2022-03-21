package org.ddongq.ex;

public class Ex07_Triangle {
	
		// 필드
		private int width;
		private int height;
		
		// 생성자
		public Ex07_Triangle(){
			this(1, 1);
		}

		public Ex07_Triangle(int width, int height){
			this.width = width;
			this.height = height;
		}
		
		// 메소드
		private double calcArea() {
			return width * height / 2.0;
		}
		
		public void output() {
			System.out.println("너비 : " + width);
			System.out.println("높이 : " + height);
			System.out.println("크기 : " + calcArea());
		}
		
}
