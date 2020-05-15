package part2;
//1. 클래스 정의
public class PrintClass {
	public static void print() { //별도 static에 할당이 된다. 
		for(int i = 0; i<20; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
	
	//인수가 한개짜리인 메소드, 같은 메소드지만 타입만 다른거: 오버로딩
	public static void print(String shape) { //별도 static에 할당이 된다. 
		for(int i = 0; i<20; i++) {
			System.out.print(shape);
		}
		System.out.println("");
	}
	
	//인수 두개짜리 메소드
	public static void print(String shape, int length) { //별도 static에 할당이 된다. 
		for(int i = 0; i<length; i++) {
			System.out.print(shape);
		}
		System.out.println("");
	}
}
