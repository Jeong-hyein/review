package part3;

public class Shape { //abstract 잠시 뺌
	//final, 클래스 앞에: 상속불가, 메소드앞에: 오버라이딩 불가, 필드앞에: 수정불가
	//static: 공유하는 필드
	public static String brand="yedam"; 
	protected int startx;
	protected int starty;
	protected int color;
	protected int width;
	
	
	
	public int getStartx() {
		return startx;
	}

	public void setStartx(int startx) {
		this.startx = startx;
	}

	public int getStarty() {
		return starty;
	}

	public void setStarty(int starty) {
		this.starty = starty;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area() {
		System.out.println("shape area");
		return 0;
		} //추상으로 바꾸려면 abstract 써줘야한다.
	
//	에러방지를 위해 디폴트 생성자를 만들어 주는것이 좋다.
	public Shape() {
		System.out.println("shape 생성자");
	}
	
	public Shape(int startx, int starty){
		this.startx = startx;
		this.starty = starty;
	}

	
}
