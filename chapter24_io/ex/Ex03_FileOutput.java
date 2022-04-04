package org.ddomgq.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileOutput {
	public static void main(String[] args) {
		
		// 저장할 데이터를 담은 변수
		String msg = "가나다라마바사아자차카타파하";		// 스캐너를 이용하여 입력가능
		
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			file = new File("hangeul.txt");		// file 안에다가 직접 입력해도 가능하긴 하다 / 그러나 객체를 통해 던져주면 그 객체의 특정 메소드를 사용할 수 있는 이점이 있다
			fw = new FileWriter(file, false);	// true : 이어쓰기, false : 덮어쓰기	
			bw = new BufferedWriter(fw);
			
			bw.write(msg);
			bw.flush();
			
			System.out.println("hangeul.txt 파일 생성!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) {
					bw.close();
				}
				if(fw!=null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
