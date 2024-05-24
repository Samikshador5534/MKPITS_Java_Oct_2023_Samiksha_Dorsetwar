package com.mkpits.concurrancy;

public class MyWorkerThread extends Thread {

	String task;
	
	public MyWorkerThread(String s) {
		this.task = s;
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().currentThread().getName()+"(start) task = "+task);
		processtask();
		System.out.println(Thread.currentThread().getName()+" (end) ");
	}

	private void processtask() {
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
