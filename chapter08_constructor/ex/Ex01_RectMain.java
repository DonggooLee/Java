package org.ddongq.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {

		Ex01_Rect rect_1 = new Ex01_Rect();
		rect_1.output();
		
		System.out.println("-------------");
		
		Ex01_Rect rect_2 = new Ex01_Rect(5);
		rect_2.output();
		
		System.out.println("-------------");
		
		Ex01_Rect rect_3 = new Ex01_Rect(3, 4);
		rect_3.output();

	}
}
