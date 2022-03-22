package org.assign1.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/* Perform handson on every methods on OptionalClass, ParallelSort, StringJoiner,Collector class in Streams.
 */
class Office{
	int id;   
    String name;  
    float salary;  
      
    public Office(int id, String name, float salary) {  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
}  


public class Task26 {

	public static void main(String[] args) {

		String[] str = new String[15];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){ 
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("Value is not present");  
        
        System.out.println("--------------------------------------------------");
		
		
		int[] arr = {19,7,2,34,1};  
        
        for (int i : arr) {  
            System.out.print(i+" ");  
        }    Arrays.parallelSort(arr);  
        System.out.println("\nArray elements after sorting");  
        
        for (int i : arr) {  
            System.out.print(i+" ");  
        }
	
        System.out.println("---------------------------------------------------");
        
        StringJoiner joinNames = new StringJoiner(",", "[", "]");  
        joinNames.add("Pavan");  
        joinNames.add("Chakri");  
        joinNames.add("Hari");  
        joinNames.add("Shyam");  
                  
        System.out.println(joinNames);  
        
        System.out.println("-------------------------------------------------------");
        
                List<Office> c = new ArrayList<Office>();    
                c.add(new Office(1,"Techouts ",25000f));  
                c.add(new Office(2,"Tcs",40000f));  
                List<Float> Companysalarylist =   
                                    c.stream()  
                                    .map(x->x.salary)        
                                    .collect(Collectors.toList());  
                System.out.println(Companysalarylist);  
        }
}
