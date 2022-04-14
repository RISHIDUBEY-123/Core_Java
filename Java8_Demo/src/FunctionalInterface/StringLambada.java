package FunctionalInterface;

interface StringLambadaInter {
	public int getLength(String s);
}


public class StringLambada {

	public static void main(String[] args) {
		StringLambadaInter i = s ->s.length();
		System.out.println(i.getLength("Hello World"));
		System.out.println(i.getLength("Lambada Expression"));

	}

}
