package com.sr.thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		//
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
