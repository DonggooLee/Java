package org.ddongq.ex;

public class Ex01_Rect {
	
		// Field
		int width;			// this.width;
		int height;			// this.height;
		
		// Constructor
		Ex01_Rect(int width, int height){
			this.width = width;			// this. 를 통해매개변수와 필드를 구분한다.
			this.height = height;
		}
		
		// Method
		void setWidth(int width) {
			this.width = width;
		}
		
		void setHeight(int height) {
			this.height = height;
		}
		
		void output() {
			System.out.println("너비 : " + width);
			System.out.println("높이 : " + height);
		}
		
}
