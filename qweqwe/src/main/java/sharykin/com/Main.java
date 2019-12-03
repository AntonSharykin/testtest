package main.java.sharykin.com;


import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Collection<SportCamp> testValues = Arrays.asList(
				new SportCamp("Anton", 2),
				new SportCamp("Kolia", 3),
				new SportCamp(null, 120)
				
				
				);
		
		List<SportCamp> camp=testValues.stream().filter(p->p.getName()!=null).collect(Collectors.toList());
		System.out.println(camp.size());//comment for git2
	}

}
