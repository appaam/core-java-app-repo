package com.sapient.aem.service;

public class Car {
	private String careMake; //ex. Maruti 
	private String carName; // ex.Swift Dezire
	private double price;  // ex. 8120000.0
	public Car() {
	}
	
	public Car(String careMake, String carName, double price) {
		super();
		this.careMake = careMake;
		this.carName = carName;
		this.price = price;
	}

	public String getCareMake() {
		return careMake;
	}
	public void setCareMake(String careMake) {
		this.careMake = careMake;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
