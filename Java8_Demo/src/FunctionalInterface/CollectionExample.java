package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class myComaparator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		if(I1>I2) {
			return -1;
		}
		else if(I1<I2) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(20);
		al.add(0);
		System.out.println("Array List Before Sorting : "+"["+al+" ]");
        Collections.sort(al,new myComaparator());
        System.out.println("Array After Sorting :"+"["+al+"]");
	}
	
}
