package com.mph;

public class LambdaEg {

	public static void main(String[] args) {
		//Java 7 - way 1
		//MyTaskThread mt = new MyTaskThread();
		//Thread t = new Thread(mt);
		//t.start();
		
		//Java 7 - way 2
		/*Runnable r  = new Runnable() {
			
			@Override
			public void run() {
				Task  t = new Task();
				t.print();				
			}
		};
		Thread t = new Thread(r);
		t.start();
		*/
		//Java 8 -1
		Runnable r2=() -> {
			Task  t = new Task();
			t.print();				
		};
		Thread t = new Thread(r2);
		t.start();
		// Java 8 - 2
		Thread th = new Thread(() -> {
			Task  ta = new Task();
			ta.print();				
		});
		th.start();
		
		//way 3
		new Thread(() -> {
			Task  ta = new Task();
			ta.print();				
		}).start();
		
		//way 4
		new Thread(() -> {
			new Task().print();				
		}).start();
		
		// Method Reference
		new Thread(new Task()::print).start();

	}

}