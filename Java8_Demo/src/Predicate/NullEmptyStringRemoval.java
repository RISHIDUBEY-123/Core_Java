package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NullEmptyStringRemoval {

	public static void main(String[] args) {
		String[] names = {"Rishi","",null,"Amit",null,"","Ankesh",null,""};
		Predicate<String> premoval=s -> s!=null && s.length()!=0;
		ArrayList al = new ArrayList<>();
		for(String str:names) {
			if(premoval.test(str)) {
				al.add(str);
			}
		}
		System.out.println("List of valid names : ");
        System.out.println(al);
	}

}
