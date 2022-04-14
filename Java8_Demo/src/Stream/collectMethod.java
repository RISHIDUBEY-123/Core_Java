package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class collectMethod {

	public static void main(String[] args) {
   ArrayList<String> al = new ArrayList<String>();
    al.add("Rishi");
    al.add("Venkatesh");
    al.add("Akash");
    al.add("Subramanyam");
    al.add("Mahnedra");
    al.add("Tirchupalli");
    System.out.println("Simple array list addition : "+ al);
    
    // Using stream class collect method
    
    List <String> list = al.stream().filter(s->s.length()<=9).collect(Collectors.toList());
    System.out.println("Array List after adding collectors method : "+list);
    
    //Using map method of filter
    List <String> listMap = al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
    System.out.println("Array List after adding map method : "+listMap);
    
    //Using count() method 
    Long count = al.stream().filter(s->s.length()>=9).count();
    System.out.println("Array List after adding count method : "+count);
	}

}
