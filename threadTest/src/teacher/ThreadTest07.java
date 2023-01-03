package teacher;

import javax.swing.JOptionPane;

// 
// 컴퓨터와 가위바위보를 진행하는 프로그램을 작성하시오.
// 컴퓨터의 가위바위보는 난수를 이용해서 구하고
// 사용자의 입력은 showInputDialog() 메서드를 이용해서 입력 받는다.
// 입력 시간은 5초, 초과하면 사용자가 진 것으로 처리하고
// 5초안에 입력이 완료되면 컴퓨터와 승패를 구해서 결과를 출력한다.
// 
public class ThreadTest07 {
	public static boolean Inputcheck = false;

	public static void main(String[] args) {
		while(true) {
			Inputcheck = false;
			GameTimer gt = new GameTimer();

			// 난수를 이용해서 컴퓨터의 가위바위보를 정한다.
			String[] data = { "가위", "바위", "보" };
			int index = (int) (Math.random() * 3);
			String com = data[index];

			// 사용자의 가위바위보 입력받기
			String userstr = "";
			gt.start();
			do {
				userstr = JOptionPane.showInputDialog("입력하세요 : ");
				if("가위".equals(userstr) || "바위".equals(userstr) || "보".equals(userstr)) {
					gt.stop();
					Inputcheck = true;
				}else {
					System.out.println("정확히 입력해주세요.");
				}
//			}while(!("가위".equals(userstr) || "바위".equals(userstr) || "보".equals(userstr)));
			}while( !"가위".equals(userstr) && !"바위".equals(userstr) && !"보".equals(userstr));

			// 결과 판정하기
			String result = "";
			if (com.equals(userstr)) {
				result = "비겼습니다.";
			}else if(userstr.equals("가위") && com.equals("보")
					||userstr.equals("바위") && com.equals("가위")
					||userstr.equals("보") && com.equals("바위")){
				result = "당신이 이겼습니다.";
			}else {
				result = "당신이 졌습니다.";
			}
			
			System.out.println("----------------- 결 과 -----------------");
			System.out.println("컴퓨터 : " + com);
			System.out.println("사용자 : " + userstr);
			System.out.println("결과 : " + result);
			System.out.println();
			
		}
	}
}

class GameTimer extends Thread{
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			if (ThreadTest07.Inputcheck) {
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("----------------- 결 과 -----------------");
		System.out.println("시간초과로 당신이 졌습니다.");
		System.exit(0);
	}
}