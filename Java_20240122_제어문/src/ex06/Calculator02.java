package ex06;

public class Calculator02 {
	
		public static void main(String[] args) {
			
		
	//리턴값이 없는 메소드 선언
	 	powerOn();
		powerOff();
		
		int num = plus(5,2);
		System.out.println(num);
		
		double avg = divide(5,2);
		System.out.println(avg);
	}		
	
	//리턴값이 없는 메소드 선언
		static void powerOn() {
			System.out.println("전원을 켭니다.");
		}
	
	//리턴값이 없는 메소드 선언
	static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	static int plus(int x, int y) {
		int result = x + y;
		return result; //리턴값 지정;
	}
	
	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	static double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;  //리턴값 지정
	}

	
	
}
