package org.ddomgq.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_FileCopy {
	public static void main(String[] args) throws IOException {
		
		
		try {
			File file = new File("bart.jpg");
			
			if(file.exists()) {						// file.exists() 있으면 true 없으면 false
				// 입력 스트림
				FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				// 출력 스트림
				FileOutputStream fos = new FileOutputStream("bart2.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				byte[] buffer = new byte[1024];		// 주로 바이트 배열 타입으로 담는다 
				while(bis.read(buffer) != -1) {		// 갖고온 데이터가 -1이 아니면 무한 루프 돌린다
					bos.write(buffer);
				}
				bos.flush();
			} else {
				System.out.println("파일이 없습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
