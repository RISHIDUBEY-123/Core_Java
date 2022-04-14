package Stream;

import java.util.ArrayList;

public class toArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(55);
		al.add(10);
		al.add(15);
		al.add(20);
		
		Integer[] array = al.stream().toArray(Integer[]::new);
		for(Integer x : array) {
			System.out.println("Array of your numbers are :"+ x);
		}
	}

}
