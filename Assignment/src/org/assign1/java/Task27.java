package org.assign1.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task27 {

	public static void main(String[] args) {
		try {
			int[] x = new int[10];
			x[12] = 90/0;
			File file = new File("o.abcfile.txt"); 
			FileInputStream stream = new FileInputStream(file); 
		}
		catch(ArithmeticException ae) {

			System.out.println("Occuring Arithmetic Expression");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {

			System.out.println("Occuring of Array Index Exception");
		}
		catch(IOException ioe) {
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Enter remaining code of program ");
		}
		System.out.println("done");
	}

}