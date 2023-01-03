package kr.or.ddit.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest1 {
	public static void main(String[] args) {
		/*
		 * File IO는 파일을 읽고 쓰고 하는 방법론에 대해 알 수 있습니다.
		 * 
		 * # 파일을 읽는 방법론(read)
		 * - BufferedReader (제일중요)
		 * - BufferedInputStream (제일중요)
		 * - FileReader
		 * - FileInputStream
		 * - InputStreamReader
		 * - ByteArrayInputStream
		 * - ObjectInputStream
		 * 
		 * # 파일을 쓰는 방법론(write)
		 * - BufferedWriter (제일중요)
		 * - BufferedOutputStream (제일중요)
		 * - FileWriter
		 * - FileOutputStream
		 * - OutputStreamWriter
		 * - ByteArrayOutputStream
		 * - ObjectOutputStream
		 */
		
		// 1. 파일 객체 만들기
		// -----------------------------------------
		// File 객체는 new File을 이용하여 만든다.
		// File 객체를 만들때 폴더의 위치, 파일의 위치를 설정할 수 있다.
		// -----------------------------------------
		// 1-1. 파일 객체를 생성 시, 파일의 위치를 설정하는 방식
		// 1) '/' 방식	: new File("D:/dir/dir_file.txt")
		// 2) '\\' 방식	: new File("D:\\dir\\dir_file.txt")
		
		// 1-2. 파일 위치를 이용하여 파일 객체 만들기
		// new File("D:/dir/dir_file.txt")
		
		// 1-3. 폴더의 위치를 이용하여 파일 객체 만들기
		// new File("D:/dir")
		
		// 1-4. 폴더의 위치와 파일의 위치를 이용하여 파일 객체 만들기
		// new File("D:/dir", "dir_file.txt")
		
		System.out.println("폴더 경로를 이용하여 파일 객체 만들기 -----------------------------");
		File file1 = new File("D:/dir");
		if (!file1.exists()) {
			file1.mkdir(); // 폴더가 없으면 생성
		}
		filePrint(file1);
		System.out.println();System.out.println();
		
		System.out.println("파일 경로를 이용하여 파일 객체 만들기 -----------------------------");
		File file2 = new File("D:/dir/dir_file1.txt");
		filePrint(file2);
		System.out.println();System.out.println();
		
		System.out.println("폴더 경로와 파일 경로를 이용하여 파일 객체 만들기 -----------------");
		File file3 = new File("D:/dir", "dir_file2.txt");
		filePrint(file3);
		System.out.println();System.out.println();
		
		
		// 2.폴더 만들기
		// - mkdir --> 설정한 경로 마지막 폴더를 만든다. 
		//		   --> 반환값이 true(성공), false(실패)
		//		   --> 경로 마지막 폴더를 만들기때문에, 중간 경로가 정확하게 생성되어 있어야함.
		//
		// - mkdirs --> 경로로 설정된 경로가 존재하지 않으면 설정된 경로 모두를 생성한다.
		//
		// - exists() 메서드 --> 폴더를 만들 때 사용하는 폴더 존재 여부 체크
		//				     --> 파일 객체를 만들 때, 경로로 설정한 위치의 파일/폴더가 있는지 체크
		//-------------------------------------------------------------------------------------------
		// 경로 : D:/dir/folder1/test 폴더 만들기
		// 1-1. mkdir로 폴더 만들기
//		File file4 = new File("D:/dir/folder1/test");
		File file4 = new File("D:/dir/folder3/test");
		if (!file4.exists()) {
			boolean state = file4.mkdir(); // 폴더가 없으면 생성
			if(state) {
				System.out.println(file4.getName() + "을 "+ file4.getPath()+" 위치에 생성하였습니다.");
			}else {
				System.out.println("생성에 실패하였습니다.");
			}
		}
		
		// 2-2. mkdirs로 폴더 만들기
		// 경로 : D:/dir/folder2/test/f1 폴더 만들기
		File file5 = new File("D:/dir/folder3/test/f1");
		if (!file5.exists()) {
			boolean state = file5.mkdirs(); // 폴더가 없으면 생성
			if(state) {
				System.out.println(file5.getName() + "을 "+ file5.getPath()+" 위치에 생성하였습니다.");
			}else {
				System.out.println("생성에 실패하였습니다.");
			}
		}
		
		// 문제1)
		// D:/dir/folder3/test/f1
		// D:/dir/folder3/test/f2
		// D:/dir/folder3/test/f3
		// D:/dir/folder4/test/f1
		// D:/dir/folder4/test/f2
		// D:/dir/folder4/test/f3
		createFolder(3, 3);

		File file7 = new File("D:/dir/folder5/folder6/folder7/folder8/test/f1");
		createF(file7);
	}
	
	private static void createF(File file) {
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("생성하였습니다.");
			} else {
				createF(new File(file.getParent()));
			}
			file.mkdir();
		}
	}
	
	private static void createFolder(int a, int b) {
//		for (int i = a; i <= (a + 1); i++) {
//			for (int j = 1; j <= b; j++) {
//				File file6 = new File("D:/dir/folder" + i + "/test/f" + j);
//				if (!file6.exists()) {
//					boolean state = file6.mkdirs(); // 폴더가 없으면 생성
//					if (state) {
//						System.out.println(file6.getName() + "을 " + file6.getPath() + " 위치에 생성하였습니다.");
//					} else {
//						System.out.println("생성에 실패하였습니다.");
//					}
//				}
//			}
//		}
		String[] area = { "D:/dir/forder3/test/f1", "D:/dir/forder3/test/f2", "D:/dir/forder3/test/f3",
				"D:/dir/forder4/test/f1", "D:/dir/forder4/test/f2", "D:/dir/forder4/test/f3" };
		for (int i = 0; i < area.length; i++) {
			File file = new File(area[i]);
			if (file.mkdirs()) {
				System.out.println(file.getAbsolutePath() + " 위치에 폴더를 생성하였습니다!");
			}
		}
	}

	private static void filePrint(File file) {
		// 파일 업로드시, 내가 현재 몸담고 있는 프로젝트 내의 절대경로를 먼저 설정한다.
		System.out.println("file 객체의 파일 이름 : " + file.getName());
		System.out.println("file 객체의 부모 위치(이름) : " + file.getParent());
		System.out.println("file 객체의 위치 : " + file.getPath());
		System.out.println("file 객체의 위치(절대경로) : " + file.getAbsolutePath());
		System.out.println("file 객체의 크기(사이즈) : " + file.length());
		System.out.println("file 객체의 파일 수정 시간 : " + file.lastModified());
		System.out.println("file 객체의 파일 수정 시간(변환) :" + formatter(file.lastModified()));
		System.out.println("file 객체의 경로로 설정한 매개변수 값 : " + file.toString());
		System.out.println("[파일 객체의 유형 파악]--------------------------------------------");
		System.out.println("file 객체가 디렉토리 입니까? " + file.isDirectory());
		System.out.println("file 객체가 파일 입니까? " + file.isFile());
		System.out.println("file 객체가 Read 기능이 가능합니까? " + file.canRead());
		System.out.println("file 객체가 Write 기능이 가능합니까? " + file.canWrite());
		System.out.println("file 객체가 Hidden 기능이 가능합니까? " + file.canExecute());
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
	}
	
	private static String formatter(long time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date(time));
	}
	
}
