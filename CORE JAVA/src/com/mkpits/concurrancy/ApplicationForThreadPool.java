package com.mkpits.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationForThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i<10; i++) {
			Runnable worker = new MyWorkerThread( "task  " +i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		while(!executor.isTerminated()) {}
		System.out.println("finished all threads");
	}

}
