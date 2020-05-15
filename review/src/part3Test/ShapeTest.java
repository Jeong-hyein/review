package part3Test;

import java.util.ArrayList;

import part3.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		
//		System.out.println(Shape.brand);
//		
//		Circle circle = new Circle(); //부모에 있는 생성자를 먼저 실행된다(super가 먼저)
//		Shape.brand = "samsung"; //부모의 것을 고치는거임. 
//		//brand는 같은거를 가르킨다.
//		System.out.println(Circle.brand);
//		
//		Rect rect = new Rect();
//		System.out.println(Rect.brand); 
		
		//다형성
		//1. 부모타입의 참조변수가 자식객체를 참조할 수 있다.
		//2. 메소드실행시 참조하는 객체의 메소드를 호출
		Shape s = new Circle();
		s.area();
		int r = ((Circle)s).getRadius();
		
		s = new Rect();
		s.area();
//		Circle c = new Shape(); 안됨. Circle 20byte, Shape 16byte: 메모리 참조 에러
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Rect());
		list.add(new Tri());
		for(Shape temp : list) {
			temp.area();
		}
		
	}

}
