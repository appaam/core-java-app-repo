package com.sapient.aem.service;

public class Account {
	private Long accNum;
	private Double  balance;
	private Person accHolder;
	//private static long
	private static Long counter=0L;
	
	public Account() {
		this.accNum = ++counter;
	}

	public Account(Double balance, Person accHolder) {
		super();
		this.accNum = ++counter;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public Account(Long accNum, Double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Long getAccNum() {
		return accNum;
	}

	public Double getBalance() {
		return balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(Double amount) {
		this.balance=this.balance+amount;
	}
	// balance= 800, amount = 600
	//balance = 2000, amount =1000
	public void withdraw(Double amount) {
		if(this.balance<500) {
			System.out.println("Insufficient Funds. Minimum balance of Rs. 500 to be maintained");
		}else if( (this.balance-amount) < 500) {
			System.out.println("Cannot withdraw more than "+ (this.balance-500) );
		}else {
			this.balance=this.balance-amount;
		}
	}
	
	public Double getCurrentBalance() {
		return this.balance;
	}
	
}
