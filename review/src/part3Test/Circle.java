package part3Test;

import part3.Drawable;
import part3.Movable;
import part3.Shape;

public class Circle extends Shape implements Drawable, Movable{

	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//생성자는 public, 리턴타입없음
	public Circle() { //부모 생성자를 먼저 불러야하기때문에 뭔가 적으면 에러가 뜬다.
//		super(); 있는거랑 없는거랑 같음: 부모의 생성자임
	}
	public Circle(int startx, int starty, int radius) { // super constructor(super 생성자가 없어서 에러)
		super(startx, starty); //startx,starty는 부모꺼라서 부모꺼를 가져와서 정의(초기화?)해주면 된다.
		this.radius = radius;
//		brand = "sam"; //final은 상속 받고 변경할수없도록 한다.
	}
	
	@Override
	public double area() {
		System.out.println("circle area");
		return 0;
	}

	@Override
	public void move() {
		System.out.println("circle move");	
	}

	@Override
	public void draw() {
		System.out.println("circle draw");	
	}
	

}
