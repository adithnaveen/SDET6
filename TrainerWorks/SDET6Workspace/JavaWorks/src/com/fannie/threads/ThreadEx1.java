package com.fannie.threads;

class BusinessLogic extends Thread{
	
	@Override
	public void run(){
		// simulation to kill some time 
		// this code may be talking to external resources 
		for(int i=0; i<500; i++){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("I value is "+ i +" In Thread  " + Thread.currentThread().getName());
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() +" exiting");
		
	}
}




public class ThreadEx1 {
	public static void main(String[] args) {
		// if the class has main method then it is thread class 
		
		System.out.println("Thread Name : " +Thread.currentThread().getName());
		// MIN_PRIORITY = 1
		// MAX_PRIORITY = 10 
		// NORM_PRIORITY = 5 (default) 
		System.out.println("Priority " + Thread.currentThread().getPriority());
		
		BusinessLogic bl1 = new BusinessLogic();
		// this will create an OS level thread and give control to run() 
		bl1.setPriority(Thread.NORM_PRIORITY + 1); // -> 6 
		bl1.start();
		
		int bl1priority = bl1.getPriority();
		BusinessLogic bl2 = new BusinessLogic();
		bl2.setPriority(bl1priority+1);
		bl2.start();
		
		for(int i=0; i<500; i++){
			System.out.println("I value is "+ i +" In Thread  " + Thread.currentThread().getName());
		}
		
		
		try {
			bl1.join();
			bl2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Thread " + Thread.currentThread().getName() +" exiting");
		
		
	}
}
