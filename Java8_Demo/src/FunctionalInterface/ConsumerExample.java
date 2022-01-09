package FunctionalInterface;
import java.util.function.*;
public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String>  c1=(s) -> System.out.println(s);
        
		c1.accept("java8");
	}

}
