package homework.book;

import java.util.Scanner;

public class Exer03_2_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = input.nextLine();
		System.out.print("패스워드 : ");
		int strPassword = Integer.parseInt(input.nextLine());
		
		if(name.equals("java")) {
			if(strPassword == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림.");
			}
		}else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음.");
		}
		
		input.close();
	}

}
