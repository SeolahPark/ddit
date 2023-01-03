package kr.or.ddit.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		
		// 1. BufferedReader & BufferedWriter - readLine()
		// - BufferedReader : Reader가 매개변수로 들어가는데, 이때 파일 객체를 읽어서 매개변수로 넣어줄 녀석이 필요하다.
		// >>> FileReader()
		BufferedReader br = null;

		File file = new File("D:\\dir\\test.txt");
		FileReader fr;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// BufferedReader 로 파일 읽기
			// - readLine() 메서드 >>> 개행문자, 줄바꿈을 만나면 readLine()을 종료함.
			// 1) for문을 이용한 파일 읽기
			String tmp = "";
			for (int i = 1; (tmp = br.readLine()) != null; i++) {
				System.out.printf("%4d : %s\n", i, tmp);
			}

			// 2) while문을 이용한 파일 읽기
			String tmp2 = "";
//			int i = 1;
//			while ((tmp2 = br.readLine()) != null) {
//				System.out.printf("%4d : %s\n", i, tmp2);
//				i++;
//			}

			// - BufferedWriter는 Writer가 매개변수로 들어가는데, 이때 파일 객체를 읽어서 매개변수로 넣어줄 녀석이 필요하다.
			// >>> FileWriter()
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(new File("D:\\dir\\test.txt")));
				bw = new BufferedWriter(new FileWriter(new File("D:\\dir\\test1.txt")));
				
				// 1) for문을 이용한 파일 읽기
//				String temp1 = "";
//				for (int i = 1; (temp1 = br.readLine()) != null; i++) {
//					bw.write(temp1 + "\n");
//				}
				
				// 2) while문을 이용한 파일 읽기
				String temp2 = "";
				while ((temp2 = br.readLine()) != null) {
					bw.write(temp2 + "\n");
				}

				bw.append("\n작성을 완료하였습니다!");
				bw.flush();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(bw!=null) try { bw.close(); } catch(IOException e) {}
				if(br!=null) try { br.close(); } catch(IOException e) {}
			}
			
			//-----------------------------------------------------------------------------------------------------
			// 1. BufferedInputStream & BufferedOutputStream - read()
			FileInputStream fis;
			BufferedInputStream bis;
			try {
				fis = new FileInputStream(new File("D:/dir/test.txt"));
				bis = new BufferedInputStream(fis);
				
				byte[] bytes = new byte[1024];
				
				int len = 0;
				String str = "";
				while((len = bis.read(bytes)) > 0 ) {
					str = new String(bytes, 0, len);
					System.out.printf("읽은 바이트수[%d]\n", len);
				}
				System.out.printf("읽은 내용\n %s", str);
				
				bis.close();
				fis.close();
				
			} catch (Exception e) {	}
		} catch (FileNotFoundException e) {} catch (IOException e) {}
		
		// BufferedOutputStream
		FileOutputStream fos;
		BufferedOutputStream bos;
		try {
			fos = new FileOutputStream("D:/dir/dir_file2.txt");
			bos = new BufferedOutputStream(fos);

			String str = "파일에 저장될 문자열입니다. \nHello World!!!";

			bos.write(str.getBytes());
			bos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}