package org.assign1.java;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task25 {

	public static void main(String[] args) {
		
		Consumer<Integer> show = c -> System.out.println(c);
        show.accept(10);
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
 
        // Consumer to display a list of numbers
        Consumer<List<Integer> >
            showList = list -> list.stream().forEach(x -> System.out.print(x + " "));
			List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			  modify.accept(numbers);
			  
		        // Implement dispList using accept()
		        showList.accept(numbers);
	}
}
