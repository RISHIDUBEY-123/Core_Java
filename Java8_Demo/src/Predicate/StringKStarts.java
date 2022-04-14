package Predicate;

import java.util.function.Predicate;

public class StringKStarts {

	public static void main(String[] args) {
		String[] names= {"Kareena","Katrina","Karishma","Amit","Anurag"};
		Predicate<String> startsWithK=s -> s.charAt(0)=='K';
		System.out.println("The name starts with K are : ");
		for(String str : names) {
			if(startsWithK.test(str));
			{
			System.out.println(str);
			}
		}
	}

}
