package com.xworkz.Plane;

public class DeadLock {

	public static void main(String[] args) {

		String resource1 = "Printer";
		String resource2 = "Scanner";

		Runnable r1 = () -> { // Providing impl to run method of interface
								// Runnable using lambda expression
			synchronized (resource1) {

				System.out.println(Thread.currentThread().getName() + " locked " + resource1);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					synchronized (resource2) {
						System.out.println(Thread.currentThread().getName() + " locked " + resource2);
					}
				}
			}
		};

		Runnable r2 = () -> {
			synchronized (resource2) {

				System.out.println(Thread.currentThread().getName() + " locked " + resource2);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					synchronized (resource1) {
						System.out.println(Thread.currentThread().getName() + " locked " + resource1);
					}
				}
			}

		};

		Thread t1 = new Thread(r1);
		t1.setName("Laptop");
		t1.start();

		Thread t2 = new Thread(r2);
		t2.setName("Desktop");
		t2.start();

	}

}
