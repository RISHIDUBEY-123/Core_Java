package FunctionalInterface;

interface AddLambadaInter {
	public void add(int a,int b);
}

public class AddLambada {

	public static void main(String[] args) {
		AddLambadaInter i= (a,b) -> System.out.println("Addition result by Lambada expression :"+" "+(a+b));
         i.add(10, 20);
         i.add(100, 200);
	}

}
