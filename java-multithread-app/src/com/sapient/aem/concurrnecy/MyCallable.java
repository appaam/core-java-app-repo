
package com.sapient.aem.concurrnecy;

import java.util.concurrent.Callable;
/**
 * 
 * @author Admin
 *	Runnable interface
 *		public void run();
 *  Callable<T> interface
 *  	public T call() throws Exception;
 * 
 */

public class MyCallable implements Callable<Long>{
	private Integer number;

	public MyCallable() {

	}

	public MyCallable(Integer number) {
		this.number=number;
	}

	@Override
	public Long call() throws Exception {
		if(number<0) {
			throw new Exception("Invalid number");
		}
		Long result=1L;
		while(number>0) {
			result=result*number;
			number--;
		}
		return result;
	}

}
