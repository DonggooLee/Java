package org.ddomgq.ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutput {
	public static void main(String[] args) {
		
		// 바이트 기반 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			/*
			 * FileOutputStream(생성할 파일의 경로 및 파일 이름)
			 * 	- 경로 지정을 안하면 현재 디렉토리에 파일 생성(상대경로)
			 *  - ex) C://file/alphabet.txt(절대경로)
			 */
			fos = new FileOutputStream("alphabet.txt");	// 주 스트림 (프로젝트 폴더가 루트폴더 역할을 한다)
			bos = new BufferedOutputStream(fos);		// 보조 스트림은 주스트림을 객체로 놓는다
			
			char ch = 'A';			// 아스키 코드 시작 문자
			while(true) {
				bos.write(ch);
				if(ch == 'z') {		// 아스키 코드 종료 문자
					break;
				}
				ch++;				// 아스키 코드 다음 문자
			}
			bos.flush();			// 버퍼 비워주기
			
			System.out.println("alphabet.txt 파일 생성!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {					// 객체 닫는 것 : 주로 finally
			try {					// 생성된 객체를 닫는것도 try-catch 문을 이용해야한다
				if(bos!=null) {
					bos.close();
				}
				if(fos!=null) {
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
