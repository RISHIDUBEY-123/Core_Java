package FunctionalInterface;

interface  NormalToLambadaInter{
	public void m1();
}
public class NormalToLambadaTest {

	public static void main(String[] args) {
		NormalToLambadaInter i = () -> System.out.println("Lambada test");
		i.m1();

	}

}

