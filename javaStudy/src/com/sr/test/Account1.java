package com.sr.test;
public class Account1 {

	   private String ano;
	   private String owner;
	   private int balance;
	   
	   public Account1() {   }
	   
	   public Account1(String ano, String owner, int balance) {
	      setAno(ano);
	      setOwner(owner);
	      setBalance(balance);
	   }

	   public String getAno() {
	      return ano;
	   }

	   public void setAno(String ano) {
	      this.ano = ano;
	   }

	   public String getOwner() {
	      return owner;
	   }

	   public void setOwner(String owner) {
	      this.owner = owner;
	   }

	   public int getBalance() {
	      return balance;
	   }

	   public void setBalance(int balance) {
	      this.balance = balance;
	   }
	   
	}