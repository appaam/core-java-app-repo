package com.sapient.aem.service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class CarService {
	//returns total price of all cars
	public double sumOfPrices(Car[] cars) {
		//return total price of all the cars
		try {
			//stream of Car objects
			Stream<Car> carStream= Arrays.stream(cars);
			Optional<Double> optional= carStream
										.map((c)->c.getPrice())
										.reduce((a,b)->a+b);
			if(optional.isPresent()) {
				return optional.get();
			}else {
				return 0.0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	//return array of car names whose price is greater than 1000000
	public String[] getCarNames(Car[] cars) {
		//return array of car names whose price is greater than 1000000		
		try {
			//Method-1
//			String [] obj=Arrays.stream(cars)
//							.filter((a)->a.getPrice()>1000000.0)
//							.map((a)->a.getCarName())
//							.toArray((size->new String[size]));
//			
//			return obj;	
			
			//Method-2
			Object [] objArray=Arrays.stream(cars)
					.filter((a)->a.getPrice()>1000000.0)
					.map((a)->a.getCarName())
					.toArray();
			
			//convert Object[] to String[]			
			String strArray[]= Arrays.copyOf(objArray, objArray.length, String[].class);
			return strArray;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//returns price of highest-priced car
	public double maxPrice(Car[] cars) {
		//returns price of highest-priced car
		try {
			double maxPrice= Arrays.stream(cars)
								.map((c)->c.getPrice())
								.mapToDouble(m->m)
								.max().getAsDouble();
			return maxPrice;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
}
