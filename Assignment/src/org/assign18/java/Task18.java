package org.assign18.java;
import java.util.ArrayList;
import java.util.Collections;

public class Task18 {
	public static void main(String[] args) {
		ArrayList <Employee> ls=new ArrayList<>();
		Employee emp1 = new Employee("ManiKanta",10, 2016 );
		Employee emp2 = new Employee("Prashanth",9, 2020 );
		Employee emp3 = new Employee("Venkat", 8, 2021);
		Employee emp4 = new Employee("Vishnu", 9, 2020);
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp4);
		Collections.sort(ls,new Rating());
		Collections.sort(ls,new StartYear());
		
		for(Employee e:ls){
			System.out.println(e.name+" "+e.rating+" "+e.startyear);
		}
	}
}