package org.assign21.java;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		System.out.println("Enter 0 for plus ,1 for minus, 2 for multiple , 3 for divide");
		int i = sc.nextInt();
		if(i == 0||i == 1|| i == 2||i == 3) {
			double t=op.calculate(i, sc.nextDouble(), sc.nextDouble());
			System.out.println(t);
		}
		else {
			try {
				throw new AssertionError("Not Valid");
			}
			catch(AssertionError ae) {
				System.out.println(ae);
			}
		}
	}

}