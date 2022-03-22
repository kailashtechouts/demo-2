package org.assign1.java;
/* Methods of Iterator:hasNext(),next(),remove()
	Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex(),
	previous(),previousIndex(),remove(),set(E e)*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task20 {

	public static void main(String[] args) {

		ArrayList football= new ArrayList();
		football.add("Ronaldo");
		football.add("Ronaldihno");
		football.add("Greizmann");
		football.add("Mbhappe");
		football.add("Neymar");
		football.add("Ibramovic");




		Iterator<String> itr = football.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");

		itr.remove();
		System.out.println(""+football);

		System.out.println("------------------------------------------");

		ListIterator<String> fitr = football.listIterator();
		while (fitr.hasNext()) {
			System.out.println(fitr.next());
		}

		System.out.println("------------------------------------------------");

		fitr.add("Pogba");

		System.out.println(football);

		System.out.println("-------------------------------------------------");

		fitr.hasPrevious();
		System.out.println(""+fitr.previous());

		System.out.println("-------------------------------------------------");

		fitr.nextIndex();
		System.out.println(""+fitr.next());

		System.out.println("----------------------------------------------------");

		fitr.previousIndex();
		System.out.println(""+fitr.previousIndex());

		System.out.println("----------------------------------------------------");

		fitr.remove();
		System.out.println(""+football);

		System.out.println("----------------------------------------------------");

		  
		System.out.println("After using the set() method : ");  
		while(fitr.hasPrevious()) {
			if(fitr.previous() == "Neymar") {
				fitr.set("Kaka");
			}
		}
		System.out.println(""+football);

	}
}
