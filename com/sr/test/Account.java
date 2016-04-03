package com.sr.test;

public class Account {
	private int balance = 0;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	public Account() {
		
	}
	
	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && MAX_BALANCE <= balance){
			this.balance = balance;
		}else {
		
		}
	}

	public int getBalance() {
		return balance;
	}

}
