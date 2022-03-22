package org.assign1.java;

import java.util.Scanner;

/*Implement an exception "InvalidUserName".
User inputs his UserName in console.
When length of userName is <10 or if it has "&", this should be handled by the exception*/

class InvalidUserName  extends Exception  
{  
	public InvalidUserName (String str)  
	{  

		super(str);  
	}  

}  
public class Task19 {

	public static void main(String args[])  { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.next();
		
		try{ 

			if(name.length() < 10 || name.contains("&")){  

				throw new InvalidUserName("name is not valid");    
			}  
			else {   
				System.out.println(name);   
			}
		}  
		catch (InvalidUserName ex)  
		{  
			System.out.println("Caught the exception");  

			System.out.println("Exception occured: " + ex);  
		} 
	}  
}  

