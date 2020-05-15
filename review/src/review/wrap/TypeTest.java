package review.wrap;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTest {

	public static void main(String[] args) throws ParseException {
		//1. int -> String으로 변환
		int num = 10;
		String str = Integer.toString(num);
		System.out.println("16진수: " + Integer.toHexString(num));
		
		//2. double -> Stirng
		double dnum = 4.15;
//		str = Double.toString(dnum);
//		두가지 방법
		str = dnum + "";
		System.out.println("double: " + str);

		//3. String -> int
		String snum = "1010";
		num = Integer.parseInt(snum);
		
		//4. String -> double(원시 date type)
		dnum = Double.parseDouble(snum);
		
		//5. String -> Double객체로
		Double dobj = Double.parseDouble(snum);  //double변환 -> 박싱
		
		//6. 기본 double -> int (텍스트 연산자)
		num = (int) dnum;
		
		//7. 객체 Double -> int (객체. 하면 나온다)
		num = dobj.intValue();
		
		//8. Date -> long(숫자값)
		Date today = new Date();
		long todayNum = today.getTime();
		System.out.println("todayNum: " + todayNum);
		
		//9. long -> Date
		Date hireDate = new Date(todayNum);
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		//10. Date -> String SimpleDateFormat
		String strDate = format.format(hireDate);
		System.out.println("strDate: " + strDate);
		
		//11. String -> Date
		String xmas = "2020/12/25 22:00";
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		hireDate = format2.parse(xmas);
		System.out.println(hireDate);
		
	}

}
