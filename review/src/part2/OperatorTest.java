package part2;

import part1.OperatorClass;

public class OperatorTest {
//	같은 패키지 
	public static void main(String[] args) {
		OperatorClass op = new OperatorClass();
		op.setNum(10,20); //num1,num2 초기화
		int result = op.sum(); //두 수의 합을 리턴
//		System.out.println(op.num1); //private라서 접근불가
		System.out.println(result);
	}
}