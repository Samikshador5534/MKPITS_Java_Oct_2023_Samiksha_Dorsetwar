package com.mkpits.thread;

public class MultiThreadingDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		//t1.start();     //illegalthread`stateexception
		MyThread2 t2 = new MyThread2();
		t2.start();
	}

}
