package e_oop.tv;

import e_oop.ScanUtil;

public class TV {

	private boolean power; // 전원 상태
	private int channel; // 채널
	private int volume; // 음량

	private final int MIN_CHANNEL = 1;
	private final int MAX_CHANNEL = 100;
	private final int MIN_VOLUME = 0;
	private final int MAX_VOLUME = 10;
	// ctrl + shift + x : 대문자
	// ctrl + shift + y : 소문자

	public TV() {
		this.power = false;
		this.channel = this.MIN_CHANNEL;
		this.volume = this.MIN_VOLUME;
	}

	public void toggleTv() {
		this.power = !this.power;
		System.out.println(this.power ? "전원이 켜졌습니다" : "전원이 꺼졌습니다.");
	}

	public void setChannel(int channel) {
		if (!(channel < MIN_CHANNEL && channel > MAX_CHANNEL))
			this.channel = channel;

		if (this.power) {
			while (channel > 100 || channel < 1) {
				System.out.print("다시 입력해주세요(1~100) : ");
				channel = ScanUtil.nextInt();
			}
			this.channel = channel;
			System.out.printf("채널을 %3d로 변경했습니다.\n\n", this.channel);
		} else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}

	public void setChannelUp() {
		if (this.power) {
			if (this.channel > this.MAX_CHANNEL) {
				this.channel = this.MIN_CHANNEL;
				System.out.printf("채널을 %3d로 변경했습니다.\n\n", this.channel);
			} else {
				this.channel++;
				System.out.printf("채널을 %3d로 변경했습니다.\n\n", this.channel);
			}
		} else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}

	public void setChannelDown() {
		if (this.power) {
			if (this.channel < this.MIN_CHANNEL) {
				this.channel = this.MAX_CHANNEL;
				System.out.printf("채널을 %3d로 변경했습니다.\n\n", this.channel);
			} else {
				this.channel--;
				System.out.printf("채널을 %3d로 변경했습니다.\n\n", this.channel);
			}
		} else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}

	public void setVolumeUp() {
		if (this.power) {
			if (this.volume > MAX_VOLUME) {
				this.volume = MAX_VOLUME;
				System.out.printf("볼륨을 %3d로 변경했습니다.\n\n", this.volume);
			} else {
				this.volume++;
				System.out.printf("볼륨을 %3d로 변경했습니다.\n\n", this.volume);
			}

		} else {
			System.out.println("TV 전원을 켜주세요.");
		}

	}

	public void setVolumeDown() {
		if (this.power) {
			if (this.volume < MIN_VOLUME) {
				this.volume = MIN_VOLUME;
				System.out.printf("볼륨을 %3d로 변경했습니다.\n\n", this.volume);
			} else {
				this.volume--;
				System.out.printf("볼륨을 %3d로 변경했습니다.\n\n", this.volume);
			}
		} else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}

	/*----------------------------------쌤 코 드----------------------------------*/

	public void togglePower() {
		this.power = !this.power;
		System.out.println(this.power ? "전원이 켜졌습니다" : "전원이 꺼졌습니다.");
	}

	public void showInfo() {
		if (this.power) {
			System.out.println("-------------------------------------");
//			System.out.println("현재 채널 : " + this.channel);
//			System.out.println("현재 볼륨 : " + this.volume);
			showChannel();
			ShowVolume();
			System.out.println("-------------------------------------\n");
		}
	}

	private void ShowVolume() {
		System.out.print("현재볼륨 : ");
		for (int i = 0; i < this.volume; i++) {
			System.out.print("■");
		}
		for (int i = 0; i < (this.MAX_VOLUME - this.volume); i++) {
			System.out.print("□");
		}
		System.out.println(" " + this.volume);

	}

	public void VolumeUp() {
		if (this.power) {
			this.volume++;
			if (this.volume > MAX_VOLUME) {
				this.volume = MAX_VOLUME;
			}
			ShowVolume();
		} else
			System.out.println("전원을 켜주세요.");

	}

	public void VolumeDown() {
		if (this.power) {
			this.volume--;
			if (this.volume < MIN_VOLUME) {
				this.volume = MIN_VOLUME;
			}
			ShowVolume();
		} else
			System.out.println("전원을 켜주세요.");

	}

	private void showChannel() {
		System.out.println("현재채널 : " + this.channel);
	}

	public void channelUp() {
		if (this.power) {
			this.channel++;
			if (this.channel > this.MAX_CHANNEL) {
				this.channel = this.MIN_CHANNEL;
			}
			showChannel();
		} else
			System.out.println("전원을 켜주세요.");
	}

	public void channelDown() {
		if (this.power) {
			this.channel--;
			if (this.channel < this.MIN_CHANNEL) {
				this.channel = this.MAX_CHANNEL;
			}
			showChannel();
		} else
			System.out.println("전원을 켜주세요.");
	}

	public void moveChannel() {
		// 종류1. 허용되지 않는 채널을 입력하면 현재 채널에 머무르는 tv
//		if (this.power) {
//			System.out.println("채널 입력 >> ");
//			int channel = ScanUtil.nextInt();
//			if (channel < this.MIN_CHANNEL || channel > this.MAX_CHANNEL) {
//				System.out.println(channel + "번은 없습니다.");
//			} else {
//				this.channel = channel;
//			}
//		}
		// 종류2. 허용되지 않는 채널을 입력하면 앞 숫자부터 허용되는 범위로 이동하기.
		if (this.power) {
			System.out.println("채널 입력 >> ");
			int channel = ScanUtil.nextInt();
			while (channel > this.MAX_CHANNEL) {
				channel /= 10;
			}
			this.channel = channel;
			showChannel();
		} else
			System.out.println("전원을 켜주세요.");

	}

}