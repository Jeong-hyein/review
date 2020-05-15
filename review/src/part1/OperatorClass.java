package part1;

public class OperatorClass {
	protected int num1; //다른 패키지일때(상속만 하고싶을때,상속 받은 사람만 사용하게끔?)
	private int num2;
	private int result;
	
	public void setNum(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int sum() {
		result = num1 + num2;
		return result;
	}
	
}
