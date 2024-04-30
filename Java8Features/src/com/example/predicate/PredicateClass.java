package com.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PredicateClass {

	public static void main(String[] args) {

		final Logger log = Logger.getAnonymousLogger();
	
		
		// Example5
		Predicate<String>  startWithLetter = x -> x.toLowerCase().charAt(0) == 'p' ; 
		System.out.println(startWithLetter.test("Pradeep"));
		
		Predicate<String> endWithletter = x -> x.toLowerCase().charAt(x.length()-1) == 'p';
		System.out.println(endWithletter.test("Pradeep"));
		
		// using end function 
		Predicate<String>  end = startWithLetter.and(endWithletter);
		log.info("and "+end.test("Pradeep"));
		
		// Using or function 
		Predicate<String>  or = startWithLetter.or(endWithletter);
		log.info("or: "+ or.test("Aru"));
		
		//isequal
		
		Student s1 = new Student(1, "Pradeep");
		Student s2 = new Student(2, "Aru");
		
		Predicate<String> isEqual = Predicate.isEqual(s1.getName());
		log.info("isequal: "+ isEqual.test("Pradeep"));
		log.info("isequal: "+ isEqual.test("aru"));
		
		// Example :4
		
		Predicate<String>  startWithLowerLetter = x -> x.toLowerCase().substring(0).equals("p"); 
		System.out.println(startWithLowerLetter.test("Pradeep"));
		
		Predicate<String>  subStringWithLowerLetter = x -> x.toLowerCase().substring(0,1).equals("p") ; 
		System.out.println(subStringWithLowerLetter.test("Pradeep"));
		
	
		
		// Example :3 
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer>  liPredicate = Arrays.stream(arr).boxed().collect(Collectors.toList());
	    int sum = liPredicate.stream().filter(x -> x%2==0).mapToInt( x -> x).sum();
	    System.out.println( "sum :"+sum);
	    
	    int odd = liPredicate.stream().filter(x -> x%2 !=0).mapToInt(x -> x).sum();
	    System.out.println(odd);
		
		// Example :2
		Predicate<Integer> pradicateEvn = x -> x % 2 == 0;
		System.out.println(pradicateEvn.test(23));

		
		// Example :1 
		Predicate<Integer> predicate1 = x -> x > 10000;
		System.out.println(predicate1.test(23000000));

	

	}

}

// Predicate is used to check the condition its test method return boolean value only.
