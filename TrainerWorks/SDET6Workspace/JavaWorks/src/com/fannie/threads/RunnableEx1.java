package com.fannie.threads;


class YourJob{}

class MyJob extends YourJob implements Runnable{

	Thread t; 
	public MyJob(){}
	public MyJob(String threadName, int priority) {
		t = new Thread(this, threadName);
		t.setPriority(priority);
		// this statement shall create an OS level thread and invoke run()
		t.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("I value is "+ i +" In Thread  " + Thread.currentThread().getName());
		}
		System.out.println("Thread " + Thread.currentThread().getName() +" exiting");
	}
	
}

public class RunnableEx1 {
	public static void main(String[] args) {
		// parametric constructor it will create a thread and call run()
		MyJob m1 = new MyJob("Surya", 6);
		MyJob m2 = new MyJob("Sandhya", 7);
		MyJob m3= new MyJob("Hemalatha", 8);
		
		Thread t1 = new Thread(new MyJob());
		t1.setName("Medha");
		t1.setPriority(6);
		t1.start();
		
	
	}
}
