package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionLambada {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(20);
		al.add(0);
		System.out.println("Lambada Array List Before Sorting : "+"["+al+" ]");
        Collections.sort(al,(I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("Lambada Array After Sorting :"+"["+al+"]");
	}

}
