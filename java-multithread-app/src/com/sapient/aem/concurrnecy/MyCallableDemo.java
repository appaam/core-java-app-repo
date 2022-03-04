package com.sapient.aem.concurrnecy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableDemo {

	public static void main(String[] args) {
		try {
			ExecutorService executorService= Executors.newSingleThreadExecutor();
			Callable<Long> callable= new MyCallable(10);
			Future<Long> future= executorService.submit(callable);
			
			while(!future.isDone()) {
				System.out.println("Computing...");
				Thread.sleep(1000*10);
			}
			
			System.out.println(future.get());
			
			executorService.shutdown();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
