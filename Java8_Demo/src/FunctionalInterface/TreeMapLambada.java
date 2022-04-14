package FunctionalInterface;

import java.util.TreeMap;

public class TreeMapLambada {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>((I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		tm.put(10,"Suraj");
		tm.put(5,"Srawan");
		tm.put(20,"Anmol");
		tm.put(30,"Rishi");
		tm.put(50,"Indranil");
        System.out.println("Lambada Array After Sorting :"+"["+tm+"]");

	}

}
