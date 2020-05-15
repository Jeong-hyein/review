package part1;

public class OperatorTest2 {

	public static void main(String[] args) {
		
		int a = 5 + 6 + 7;
		int b, c;
		a = b = c = 10; //증감, 대입연산자는 오른쪽에서 시작
		
		a = 0;
//순서		 5	   3	 2	   4	 1
		b = a++ + ++a + ++a + a++ + ++a;
//b값		 3	   3	 2	   3	 1
//계산후		 5				   4
		
		System.out.println(b);
		System.out.println(a);
	}
}
