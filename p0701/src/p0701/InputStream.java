package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		
		// 기본적인 InputStream 형태
		try {
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0;
			while((read = fis.read()) != -1) { // fis.read() 파일의 데이터를 읽어옴.
				System.out.println((char)read);
			}
		}catch (Exception e) {e.printStackTrace();}
		
		
//		byte[] b = new byte[1024];
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			fis.read(b); // 파일 읽어오기
//			System.out.println(new String(b));
//		
//		} catch (Exception e) {e.printStackTrace();}
	}

}
