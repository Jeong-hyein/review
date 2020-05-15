package part1;

public class VarTest {
	public static void main(String[] args) {
		//정수형 진수
		char c1 = 0xAC00; //44032; // '가'; // '\uac00';
		System.out.println((int)'\uac00');
		System.out.println(c1);
		int num1 = 0x10; //16, 0x: 16진수
		int num2 = 010;  //8, 0:8진수
		int num3 = 10;   //10, 10진수
		System.out.println(String.format("%5d,%5d,%5d", num1,num2,num3));
		
		
		
		//타입 8가지: byte, short, int, long(정수형), float, double, boolean, char
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//overflow
		//BigDecimal
		
		//실수 -> 유효자리 0.00001 -> 1*10^-6  
		//100000 -> 1*10^6
		//0.12345678 -> 1.2345678 * 10^-7 : 유효자리수 7개
		float fnum = 0.123456789f; //f빼면 double이 된다. 7자리까지(9에서 반올림해서 79가 나온다)
		System.out.println(fnum);
		double dnum = 0.123456789; //15자리
		System.out.println(dnum);
		
		//char -> 유니코드
		char c = '가';
		System.out.println((int)c); //가의 코드값이 나옴
		System.out.println(Integer.toHexString((int)c)); //16진수표현
		
//		char c1 = '\uac01'; //유니코드에서 ac01이 뭔지 찾는다.
//		System.out.println(c1);
		
		//65:A 90:Z, 97:a 122:z ,숫자확인:48~57인지 확인하고 아니면 숫자가 아님
		char c2 = 'A';
		System.out.println((char)(c2+32)); //A를 a로 바꾸려고 32를 더해줌
		 
//		for(int i = 0; i< 127; i++) {
//			System.out.println("코드값: "+ i + "\t" +"문자값: " + (char)i); //9번: 스페이스바, (10번,13번):엔터키
//		}
		
		
		
		//상수타입, 기본: int,double
		long lnum = 1000000000000000l;
		System.out.println(lnum);
		float f = 0.123456789f;
		
	}
	
}
