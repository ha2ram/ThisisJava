package chap08;

public class RemoteControlExample2 {
	public static void main(String[] args) {

		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(true); // 디폴트 메소드

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); // 디폴트 메소드
	}
}
