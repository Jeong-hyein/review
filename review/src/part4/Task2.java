package part4;

public class Task2 implements Runnable{
	public void run() {
		for(int i = 1000; i<1100; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(500); //찍고 0.5초 기다리고 다시 찍는다
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
