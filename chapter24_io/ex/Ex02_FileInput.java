package org.ddomgq.ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInput {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
		
			int ch = 0;				// char ch; 가 아님을 주의 ★★★ 읽을 때에는 int
			while(true) {
				ch = bis.read();	// read() 메소드의 리턴이 int 타입이다
				if(ch==-1) {		// read() 메소드는 파일이 끝나면 -1 리턴
					break;
				}
				System.out.print((char)ch);	// ch는 int형이기 때문에 강제 형변환
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) {
					bis.close();
				}
				if(fis!=null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
