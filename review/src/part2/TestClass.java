package part2;

import java.util.Calendar;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		//2. 객체 생성, static이 아닐때 사용.
//		PrintClass pc = new PrintClass();
		//3. 연산자 필드나 메서드 호출
//		pc.print();
		
		//인수도 없고 리턴값도 없는 메소드
		//static이면 클래스명으로 쓸수있음.
		PrintClass.print();
		//인수가 있는 경우
//		PrintClass.print("*");
//		//인수가 두개짜리
//		PrintClass.print("&", 30);
//		
//		PrintClass pc1 = new PrintClass();
//		pc1.print();
		
		int num1 = 10;
		int num2 = 20;
		int result = SumClass.total(num1,num2);
		System.out.println(result);
		System.out.println(SumClass.total(num1,num2));
		System.out.println(SumClass.total(num1,num2,10,20));
		
		//오늘 날짜를  y/m/d  String return
		String today = DateUtil.today();
		System.out.println(today);
		
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(2000,11,25);
		String birth = DateUtil.strDate(birthDay.getTime());
		System.out.println(birth);
		String birth1 = DateUtil.strDate(birthDay.getTime(), "yyyy/MM");
		System.out.println(birth1);
	}
}
