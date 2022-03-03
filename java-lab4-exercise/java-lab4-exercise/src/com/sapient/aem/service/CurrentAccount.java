package com.sapient.aem.service;

public class CurrentAccount extends Account{
	public static final Double OVERDRAFT_LIMIT=500000.0;

	/*
	 *   1. current balance: 5L
	 *   2. withdraw amount: 5L
	 *   3. current balance: 0
	 *   4. withdraw amount: 3L
	 *   5. current balance: -3L
	 *   6. withdraw amount: -2L
	 *   7. current balance: -5L
	 *   8. withdraw amount: -1L
	 */
	
	@Override
	public void withdraw(Double amount) {
		if(this.getBalance() <= -500000.0) {
			System.out.println("Already exceeded overdraft limit of 500000.00");
		}else if( amount > OVERDRAFT_LIMIT ) {
			System.out.println("Exceeding overdraft limit of 500000.00");
		}else {
			//this.balance=this.balance-amount;
			this.setBalance(this.getBalance()-amount);
		}
	}
	
	
}
