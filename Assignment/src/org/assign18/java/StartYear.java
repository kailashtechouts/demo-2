package org.assign18.java;

import java.util.Comparator;

public class StartYear implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.startyear-o1.startyear;
	}

}
