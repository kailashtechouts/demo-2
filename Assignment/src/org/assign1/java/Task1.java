package org.assign1.java;
/* Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/
class Company {

	 String name;
	Company(String name)
	{
		this.name = name;
	}
	
}
class Employee {

	String name;
	 int rating;
	 int startyear;
	Employee(String name,int rating, int startyear)
	{
		this.name = name;
		this.rating = rating;
		this.startyear = startyear;
	}
	
}

class Task1 {

	public static void main(String[] args)
	{


		Company c = new Company("TECHOUTS");
		Employee emp1 = new Employee("ManiKanta",10, 2016 );
		Employee emp2 = new Employee("Prashanth",9, 2020 );
		Employee emp3 = new Employee("Venkat", 8, 2021);
		Employee emp4 = new Employee("Vishnu", 9, 2020);

		System.out.println(emp1.name+"-"+emp1.rating+"-"+emp1.startyear+"-"+ "is employee of "+ c.name);
		System.out.println(emp2.name+"-"+emp2.rating+"-"+emp2.startyear+"-"+ "is employee of "+ c.name);
		System.out.println(emp3.name+"-"+emp3.rating+"-"+emp3.startyear+"-"+ "is employee of "+ c.name);
		System.out.println(emp4.name+"-"+emp4.rating+"-"+emp4.startyear+"-"+ "is employee of "+ c.name);
	}
}