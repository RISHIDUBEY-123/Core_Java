package Stream;

import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(55);
		al.add(10);
		al.add(15);
		al.add(20);
		
		Integer min= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value for list is : "+min);
		
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value for list is : "+max);


	}

}
