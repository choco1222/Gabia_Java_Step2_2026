package chapter08;

public class DmbCellPhoneMain_07 {

	public static void main(String[] args) {

		DmbCellphone dmb = new DmbCellphone(11, "Java폰", "블랙");

		// 상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);

		// 자식클래스 필드

		System.out.println("채널: " + dmb.channel);

		//전화통화 구현
		System.out.println("------------------------");
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("5시 예약이요");
		dmb.receiveVoice("네, 예약되셨습니다.");
		dmb.hangUp();
		dmb.powerOff();
		
		//TV채널
		System.out.println("------------------------");
		dmb.turnOnDmb();
		dmb.changeChannelDmb(22);
		dmb.turnOnDmb();
		dmb.turnOffDmb();
	}

}
