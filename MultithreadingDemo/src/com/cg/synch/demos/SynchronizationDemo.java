package com.cg.synch.demos;

public class SynchronizationDemo {

	public static void main(String[] args) 
	{
		Resource resource=new Resource();
		Producer producer=new Producer(resource);
		Consumer consumer=new Consumer(resource);
		producer.start();
		consumer.start();
	}
}
