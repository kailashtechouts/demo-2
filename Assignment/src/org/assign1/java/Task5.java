package org.assign1.java;

public class Task5 { 
	static class Information{
		private static Information i;
		private Information() {
		}
		public static Information getInstance() {

			if(i == null) {
				i = new Information();
			}
			return i;
		}
		public void getInformation() {
			System.out.println("You are having information");
		}
	}
	public static void main(String[] args) {
		Information db1;
		db1= Information.getInstance();
		db1.getInformation();
	}
}