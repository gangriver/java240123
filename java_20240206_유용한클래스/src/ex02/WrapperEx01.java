package ex02;

public class WrapperEx01 {
	public static void main(String[] args) {
		//기본자료형 8개 빼고는 전부다 객체다
		
		int i = 10;
		
		Integer iref = new Integer(10);  //integer는 참조형 
		Integer iref2 = 20; //new Integer(20)
		
		i = iref2.intValue(); //Integer -> int
		iref = i; //new Integer(i); 오토박싱
	}
}
