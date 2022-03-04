package com.sapient.aem.ui;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

import com.sapient.aem.service.Person;
/*
 * Stream API methods can be applied only on streams.
 * 
 * How to get Stream object
 * 	1. Stream.of()
 *  2. Arrays.stream()
 *  2. List<Integer> myList= new ArrayList<>();
 *    muList.stream()
 *    
 *    Declarative style
 *    
 *    Functional programming
 */
public class StreamAPIDemo {

	public static void main(String[] args) {
		Integer list[]= {10,12,35,25,67,89,56,99,11};
		//stream() returns a sequential Stream with specified array as its source.
		Stream<Integer> stream1= Arrays.stream(list);
		
		stream1.forEach((n)->System.out.println(n));		
		System.out.println("Using method reference");
		//stream has already been operated upon or closed, runtime exception
		//stream is closed after execution of line 21
		//stream1.forEach(System.out::println);
		
		//solution is to reopen the stream		
		Arrays.stream(list).forEach(System.out::println);
		
		System.out.println("Applying map()..");
		Stream<String> courses= 
				Stream.of("Java","Java EE","Spring","Hibernate","Javascript");
		
		courses
		.map( (s)->s.length()  ) //intermediate operation
		.forEach(System.out::println); //terminal operation
		
		System.out.println("Courses in capital letters..");
		
		Stream.of("Java","Java EE","Spring","Hibernate","Javascript")
		.map((s)->s.toUpperCase())
		.forEach(System.out::println);
		
		Person persons[]= {
				new Person(523465785454L,"Smith",LocalDate.of(1990, 5, 15),"Pune","smith@gmail.com",9878985559L),
				new Person(323465785454L,"Clarke",LocalDate.of(1991,9, 15),"Mumbai","clarke@sapient.com",7878987989L),
				new Person(123465715450L,"Adams",LocalDate.of(1989, 12, 25),"Hyderabad","adams@ibm.com",9878987980L),
				new Person(223000785459L,"Jones",LocalDate.of(1998, 10, 10),"New Delhi","jones@sapient.com",8878987989L)
		};
		
		System.out.println("Person names in upper-case letters..");
		
		Stream<Person> personStream= Arrays.stream(persons);
		
		personStream
		.map((p)-> p.getName().toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("Displaying marks >=80");
		Stream.of(67,87,96,79,80,85,78)
		.filter((m)-> m>=80) //intermediate operation
		.forEach(System.out::println);
		
		System.out.println("Display persons working in sapient..");
		Arrays.stream(persons)
		.filter((p)->p.getEmail().contains("sapient"))
		.forEach(System.out::println);
		
		System.out.println("Display person names working in sapient..");
		Arrays.stream(persons)
		.filter((p)->p.getEmail().contains("sapient"))
		.map((p)->p.getName())
		.forEach(System.out::println);
		
		System.out.println("Displaying person objects in the alphabetical order of their names...");
		Arrays.stream(persons)
		.sorted(  (p1,p2)->  p1.getName().compareTo(p2.getName()))
		.forEach(System.out::println);
		
		System.out.println("Collected sorted persons into an array and displayed...");
		Object sortedPersons[] = 
				Arrays.stream(persons)
				.sorted(  (p1,p2)->  p1.getName().compareTo(p2.getName()))
				.toArray();
		
		Arrays.stream(sortedPersons).forEach(System.out::println);
		
		System.out.println("distinct(),limit() and skip() are special filters...");
		System.out.println("applying distinct().. ");
		Stream.of(67,87,96,67,80,87,96)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("applying limit().. ");
		Stream.of(67,87,96,67,80,87,96)
		.limit(4) //limit the stream to first 4 elements
		.map((n)->n*n)
		.forEach(System.out::println);
		
		System.out.println("applying skip().. ");
		Stream.of(67,87,96,67,80,87,96)
		.skip(4) //skip first 4 elements of the stream
		.map((n)->n*n)
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}
