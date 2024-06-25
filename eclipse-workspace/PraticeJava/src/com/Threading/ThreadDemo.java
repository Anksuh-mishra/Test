package com.Threading;

class MyThread1 extends Thread{
	
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("I am cooking...");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
	int i =0;
		while(i<5) {
			System.out.println("I am studing...");
			i++;
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		

	}

}
