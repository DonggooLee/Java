package org.ddongq.ex;

public class Ex05_Circle {
	
		// 필드
		private int x;
		private int y;
		private double radius;
		
		// 생성자
		public Ex05_Circle() {	
			this(0, 0, 1);
		}
		
		public Ex05_Circle(double radius){
			this(0, 0, radius);
		}
		
		public Ex05_Circle(int x, int y, double radius){
			this.x = x;
			this.y = y;
			this.radius = radius;
		}

		// 메소드 (Main에서 output만 호출하기 때문에, output에 calcArea,calcCircum이 들어가있으므로,output만 public)
		private double calcArea() {
			return radius * radius * Math.PI;
		}
		private double calcCircum() {
			return 2 * Math.PI * radius;
		}
		
		public void output() {
			System.out.println("중심 좌표 : [ " + x + " , " + y + " ]");
			System.out.println("반지름 : " + radius);
			System.out.println("크기 : " + calcArea());
			System.out.println("둘레 : " + calcCircum());
		}
		
}
