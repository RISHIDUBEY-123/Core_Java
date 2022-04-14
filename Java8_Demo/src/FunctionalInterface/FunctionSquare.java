package FunctionalInterface;

import java.util.function.Function;

class FunctionSquare {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i -> i*i;
        System.out.println("Square of number is  :"+f.apply(5));
        System.out.println("Square of number is  :"+f.apply(10));

	}
	
}
