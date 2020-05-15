package part4;

public class Task1 extends Thread {
	
//	public Task1() {
//		this.setName("task1");
//	}

	public void run() {
		synchronized (this) {
			System.out.println(this.getName()); //Thread이름 출력
			for (int i = 0; i < 1000; i++) {
				System.out.print(i + "  ");
				if(i%23 == 0) {
					System.out.println("");
				}
//				try {
//					Thread.sleep(500); // 찍고 0.5초 기다리고 다시 찍는다
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
	}
}
