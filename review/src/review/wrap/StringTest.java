package review.wrap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		
		//검색
		String path = "c:/app/images/pig.jpg";
		
		//indexof: 앞에서부터 찾는다.
		//1. 맨끝의 / 의 위치(lastindexof)
		int idx = path.lastIndexOf("/");
		System.out.println("/ 위치: " + idx);
		
		//2. 파일명만 추출 lastindexof, substring
		String fileName = path.substring(idx+1);
		System.out.println("파일명: " + fileName);
		
		//3. 파일이 jpg로 끝나는지? endWith
		boolean jpgyn = path.endsWith("jpg");
		System.out.println("jpg?: "+jpgyn);
		
		//4. 문자열 자르기 split
		String[] paths = path.split("/");
		for(String p : paths) {
			System.out.print( p +" ");
		}	
		System.out.println();
		//regexp(regular exprestion) 정규 표현식
		//패턴체크 (대소특 8자리) \d: 숫자, 특수문자 하나이상, 첫글자: 대소문자 특수문자 숫자중 하나(?=) ,{8}:8자이상, 시작:^,마지막:$
		String pattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$";
		String pw = "ab1223Q";
		String pw2 = "";
		boolean result = validationPasswd(pw2, pattern);
		System.out.println("패턴 검사: " +  result);
		
		
	}
	private static boolean validationPasswd(String pw, String pattern){
	    Pattern p = Pattern.compile("pattern");
	    Matcher m = p.matcher(pw);

	    if(m.matches()){
	        return true;
	    }
	    return false;
	}


}
