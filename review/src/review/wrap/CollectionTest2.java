package review.wrap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTest2 {
	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("100", "홍길동"));
		list.add(new MemberVO("103", "권율"));
		list.add(new MemberVO("102", "김유신"));

		// List -> Set

		// Set -> List

		// List<VO> 필드로 검색, 정렬
		Collections.sort(list, new Comparator<MemberVO>() {

			@Override
			public int compare(MemberVO o1, MemberVO o2) {
				return o1.getUserid().compareTo(o2.getUserid());
				//이름순으로 하려면 getuserid를 바꾸면됨
			}
		});
		//[review.wrap.MemberVO@7852e922, review.wrap.MemberVO@4e25154f, review.wrap.MemberVO@70dea4e]
		//MemberVO에 toString 추가함
		System.out.println("id순정렬: " + list); 
		
//		람다식으로 표현
		Collections.sort(list,(o1,o2) -> o1.getUsername().compareTo(o2.getUsername()));
		System.out.println("람다식(이름순): "+list);
		
		//역순 reverse
		Collections.reverse(list);
		System.out.println("역순: "+list);
		//섞기 shuffle
		Collections.shuffle(list);
		System.out.println("섞기: "+list);
		
	}
}
