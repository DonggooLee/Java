package org.ddongq.test;

import javax.swing.JOptionPane;
public class Test10 {
	public static void main(String[] args) {

		// Test08.java -> joptionpane으로 처리!
		// Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
		// 	  BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
				
		double height = Double.parseDouble(JOptionPane.showInputDialog("키 입력>>"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게 입력>>"));
		
		height /= 100;
		
		double bmi = weight / (height*height) ;
		String overWeight = bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중";
		
		JOptionPane.showMessageDialog(null, "체질량 지수 : " +  bmi + " 체중 범위 : " + overWeight);
		

	}
}
