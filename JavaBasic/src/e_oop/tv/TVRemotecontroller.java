package e_oop.tv;

import e_oop.ScanUtil;

public class TVRemotecontroller {

	public static void main(String[] args) {
		//
		// 채널 및 볼륨과 관련된 동작들을 메서드로 만들어주세요.
		//
		// 리모콘 모양 (메뉴)
		// ------------------------------------
		// 1.전원 2.채널변경 3.채널업 4.채널다운
		// 5.볼륨업 6.볼륨다운 7.현재정보 0.종료 <- 종료합니다.
		// ------------------------------------
		//
		TV tv = new TV();

		outer: do {
			int menu = -1;
//			int channel = 1;

			System.out.println("원하는 메뉴를 입력해주세요");
			System.out.println("-------------------------------------");
			System.out.println("1.전원 2.채널변경 3.채널업 4.채널다운");
			System.out.println("5.볼륨업 6.볼륨다운 7.현재정보 0.종료");
			System.out.println("-------------------------------------");
			menu = ScanUtil.nextInt();

			switch (menu) {
			case 1:
				tv.togglePower();
				break;

			case 2:
//				System.out.print("원하는 채널을 입력해주세요(1~100) : ");
//				channel = ScanUtil.nextInt();
//				tv.setChannel(channel);
				tv.moveChannel();
				break;

			case 3:
//				tv.setChannelUp();
				tv.channelUp();
				break;

			case 4:
//				tv.setChannelDown();
				tv.channelDown();
				break;

			case 5:
//				tv.setVolumeUp();
				tv.VolumeUp();
				break;

			case 6:
//				tv.setVolumeDown();
				tv.VolumeDown();
				break;

			case 7:
				tv.showInfo();
				break;

			case 0:
				System.out.println("전원이 꺼졌습니다. 프로그램을 종료합니다");
				break outer;

			default:
				System.out.println("잘못입력했습니다.");
			}
		} while (true);

	}

}
