package com.xworkz.Plane;

public class Daemon implements Runnable {

	@Override
	public void run() {

		System.out.println("Daemon thread is running");

	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Daemon());
		Thread thread2 = new Thread(new Daemon());

		thread2.setDaemon(true);

		thread2.start();
		thread1.start();
		System.out.println("Is thread1 a daemon thread " + thread1.isDaemon());
		System.out.println("Is thread2 a daemon thread " + thread2.isDaemon());

	}

}
