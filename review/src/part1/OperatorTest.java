package part1;
/*
 * 연산자
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		//삼항연산
		int score = 80;
		String grade = score >= 60 ? "success" : "fail";
		boolean booleangrade = score >= 60 ? true : false;
		char chargrade = score >= 90 ? 'A' : (score >= 80 ? 'B':'C');
		System.out.println("등급: " + chargrade);
		
		//증감
		int a = 5;
		int b = 10;
		int c = a++ + ++b;
		//더하기 전 a=6, b = 10
		//더하고 나면 a=6, b=11, c=16
		
		System.out.println(a +", "+ b + ", " + c);
		System.out.println(String.format("%5d,%5d,%5d", a, b, c));
		System.out.printf("%d,%3d,%3d", a,b,c);
		System.out.println();
		
		//논리 (&& || !) a가 10 ~ 20 
		//10과 20 사이인지
		boolean b1 = 10 <= a && a <= 20 ;
		System.out.println(b1);
		
		//10보다 작거나 20보다 큰지
		boolean b2 = a <= 10 || a >= 20;
		System.out.println(b2);
		
		boolean b3= !(10 <= a && a <= 20);
		System.out.println(b3);
		
		//a,b 범위가 10~20 사이
		boolean b4 = (a<b) && (10 <= a && b <= 20) ;
		System.out.println(b4);
		
		a= 15; b=5;
		boolean b5 = (10 <= a && b <= 20) && (b-a)>=0 ;
		System.out.println("논리 연산: " + b5);
		
		Integer inta = 5;
		Integer intb = null;
		b1 = inta>=10 && intb>=20; //&&: 에러x , ||: 에러o
		System.out.println(b1);
		
	}

}
