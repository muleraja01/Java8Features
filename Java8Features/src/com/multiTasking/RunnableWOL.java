package com.multiTasking;

public class RunnableWOL implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new RunnableWOL();
		Thread t = new Thread(r);
		t.start();
		for (int i=0;i<=10;i++) {
			System.out.println("Main Thread....");
		}

	}
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println("Child Thread....");
		}
	}

}
