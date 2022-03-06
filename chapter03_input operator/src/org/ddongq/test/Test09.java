package org.ddongq.test;

//★ 사용안하는 import 자동 제거 단축키  : Ctrl + Shift + O
import javax.swing.JOptionPane;
public class Test09 {
	public static void main(String[] args) {
		
		// Test05.java -> joptionpane 으로 처리!
		// Q. 국,영,수 점수를 입력받아 평균과 학점 출력하기 
		// 평균값이 90이상이면 'A", 80이상이면 'B', 70이상이면 'C', 60이상이면 'D', 이하는 'F'
				
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력"));
		int mat = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력"));
		
		double ave = (kor + eng + mat) / 3.0;
		char grade = ave >= 90 ? 'A' : 
						ave >= 80 ? 'B' : 
							ave >= 70 ? 'C' : 
								ave >= 60 ? 'D' : 'F';
		
		JOptionPane.showMessageDialog(null, "평균 점수 : " + ave + " 학점 " + grade);
		
	}
}
