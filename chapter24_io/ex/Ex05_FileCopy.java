package org.ddomgq.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_FileCopy {
	public static void main(String[] args) throws IOException {
		// Ex01 + Ex02 합쳐서 "파일 복사" 코드를 만들어 보자
		
		// 입력 스트림
		FileInputStream fis = new FileInputStream("alphabet.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 출력 스트림
		FileOutputStream fos = new FileOutputStream("alphabet2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while(true) {
			data = bis.read();
			if(data==-1) {		
				break;
			}
			bos.write(data);
		}
		bos.flush();				// 반복문 끝에서 적기
		
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
	}
}
