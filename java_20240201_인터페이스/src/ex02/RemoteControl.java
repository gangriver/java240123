package ex02;

public interface RemoteControl {

//	상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	디폴트 메소드
	default void setMute(boolean mute) {
//		이전 예제와 동일한 고드이므로 생략
	}
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
