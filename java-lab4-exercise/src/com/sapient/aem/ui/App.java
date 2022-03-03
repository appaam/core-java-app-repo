package com.sapient.aem.ui;

import com.sapient.aem.service.Account;
import com.sapient.aem.service.Person;

public class App {

	public static void main(String[] args) {
		Person person1= new Person("smith",25.0f); 
		Account account1= new Account(2000.0,person1);
		
		Person person2= new Person("kathy",21.0F);
		Account account2= new Account(3000.0,person2);
		
		account1.deposit(2000.0);
		account2.withdraw(2000.0);
		
		System.out.println("Current balance of "+ account1.getAccHolder().getName() +  "is "+ account1.getCurrentBalance() );
		System.out.println("Current balance of "+ account2.getAccHolder().getName() +  "is "+ account2.getCurrentBalance() );
	}

}
