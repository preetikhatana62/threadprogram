package com.java;

public class newThread  implements Runnable{
	public void run() {
		System.out.println("new thread");
	}
	public void m1() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
