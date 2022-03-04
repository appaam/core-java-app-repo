package com.sapient.aem.concurrnecy;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {

	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		
		executor.execute(()->{
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("End of the task");
		});
		
		
		

	}

}
