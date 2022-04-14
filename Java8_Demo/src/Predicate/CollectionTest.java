package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionTest {

	public static void main(String[] args) {
		 Predicate<Collection> p=c -> c.isEmpty();
		 ArrayList al1=new ArrayList();
		 al1.add("A");
		  System.out.println(p.test(al1));
		  ArrayList al2=new ArrayList();
			 System.out.println(p.test(al2));
		  
		   
	}

}
