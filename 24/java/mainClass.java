package com.java;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainClass {
	public static void main(String[] args) {
		 int size =5;
	 Runnable [] nt=new newThread[size];
		 //newThread nt1=new newThread();
		 
		for( int i=0;i<5;i++)
		{
			 nt[i]= new newThread();
			
		}
	/*	ExecutorService es=  Executors.newFixedThreadPool(5);
		for(int i=0 ;i<=nt.length-1;i++)
		{
		es.execute(nt[i]);
		}
		es.shutdown();
		System.out.println("completed");
	}*/

}
}
