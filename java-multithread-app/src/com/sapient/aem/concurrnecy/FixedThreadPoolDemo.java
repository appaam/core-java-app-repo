package com.sapient.aem.concurrnecy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {
		try {
			ExecutorService executor= Executors.newFixedThreadPool(10);
			//submitting 100 tasks to thread pool of 10 threads
			for(int i=1;i<=100;i++) {
				Runnable runnable= new MyRunnable(1000000L+i);
				executor.execute(runnable);
			}
			
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.MINUTES);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
