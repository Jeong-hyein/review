package part3Test;

import part3.Drawable;
import part3.Shape;

//Shape 상속, Drawable 상속
public class Tri extends Shape implements Drawable{
	//endx, endy, 생성자
	
	int endx;
	int endy;
	
		
	public int getEndx() {
		return endx;
	}
	public void setEndx(int endx) {
		this.endx = endx;
	}
	public int getEndy() {
		return endy;
	}
	public void setEndy(int endy) {
		this.endy = endy;
	}
	
	public Tri() {}
	public Tri(int startx, int starty, int endx, int endy) {
		super(startx, starty);
		this.endx = endx;
		this.endy = endy;
		
	}
	
	@Override
	public void draw() {
		System.out.println("tri draw");

	}

	@Override
	public double area() {
		return 0;
		
	}
	
	
	

}
