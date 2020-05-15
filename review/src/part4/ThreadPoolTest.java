package part4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		//스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2); //스레드풀에 스레드를 두개만들어둔다?
		executorService.execute(new Task2()); //task 실행 시 에러 발생 thread 종료
		executorService.submit(() -> { //task 실행 시 에러 발생 thread 종료x, 재사용
			for(int i =0; i<100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//			executorService.shutdown(); 스레드풀 종료
		});
		
	}
}
