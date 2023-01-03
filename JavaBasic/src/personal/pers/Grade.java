package personal.pers;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		 int intMenu = 0;
		 boolean boolFlag = true;
		 String strItem[] = new String[7];
		 String strName="";
		 String strNum="";
		 int intValue[] = new int[5];
		 double doubleAvg = 0;
		 strItem[0]="이름";
		 strItem[1]="학번";
		 strItem[2]="국어";
		 strItem[3]="영어";
		 strItem[4]="수학";
		 strItem[5]="총점";
		 strItem[6]="평균";
		 Scanner input = new Scanner(System.in);
		 
		 while(boolFlag) {
		  System.out.println("\n======================");
		  System.out.println("1. 성적 입력");
		  System.out.println("2. 성적표 출력");
		  System.out.println("3. 종료");
		  System.out.println("=======================");
		  System.out.print("메뉴를 선택하세요 : ");
		  try{
			  String num = input.nextLine();
			  intMenu = Integer.parseInt(num);
		  }catch (Exception e) {
		      System.out.println("1-3 사이의 숫자로 입력해주세요.");
		   continue;
		  }
		 
		  
		  switch(intMenu) {
		  
		   case 1:
		    System.out.println("\n[성적정보 입력]");
		   try
		   {
		    System.out.print(strItem[0]+" : ");
		    strName = new String(input.nextLine());
		    System.out.print(strItem[1]+" : ");
		    strNum = new String(input.nextLine());
		    for(int i=1; i< intValue.length-1; i++){
		       System.out.print(strItem[i+1]+" : ");
		       intValue[i]=Integer.parseInt(input.nextLine());
		       }
		    intValue[4] = intValue[1]+intValue[2]+intValue[3];
		    doubleAvg = intValue[4]/3.0;
		   }
		   catch (Exception e) {
		    continue;
		   }
		   break;
		   
		   case 2:
		    if(strName.equals("")) {
		    System.out.println("성적정보를 먼저 입력해야 합니다.");
		    continue;
		   }
		   System.out.println("\n[성적표 츨력]");
		   System.out.print(strItem[0]+" : ");
		   System.out.println(strName);
		   System.out.print(strItem[1]+" : ");
		   System.out.println(strNum);
		   for(int i=1; i < intValue.length;i++) {
		    System.out.print(strItem[i+1]+" : ");
		    System.out.println(intValue[i]+"점 ");
		   }
		   System.out.print(strItem[6]+" : ");
		   System.out.println(doubleAvg);
		   break;
		   
		   case 3:
		    System.out.println("프로그램 종료");
		    boolFlag = false;
		    break;
		    default:
		    	System.out.println("1-3 사이의 숫자로 입력해주세요");
		    }
		  
		  }
		 input.close();
		 }
	}
