package part4;

/*
 * Thread 클래스
 */

public class MultiThreadTest {
	public static void main(String[] args) {
		// Task1 실행하고 Task2 실행
//		Task1 task1 = new Task1();
//		task1.print100();

		// task1을 Thread 상속받고 run()으로 바꿈
		Task1 task1 = new Task1();
		task1.start();

//		Task2 task2 = new Task2();
//		task2.print1000();

		// task2rk runnable 상속받고 run() 오버라이드
		Task2 task2 = new Task2();
		Thread thread2 = new Thread(task2);
		thread2.start();

//		for(int i = 10000; i<10100; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//		Thread thread3 = new Thread(new Runnable() {
//			public void run() {
//				for (int i = 10000; i < 10100; i++) {
//					System.out.println(i);
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//
//			}
//		});
//		thread3.start();
		
		Thread thread3 = new Thread( () -> {
			for (int i = 10000; i < 10100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	thread3.start();
		
	}

}
