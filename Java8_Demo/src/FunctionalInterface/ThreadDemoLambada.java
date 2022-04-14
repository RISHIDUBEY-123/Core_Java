package FunctionalInterface;

public class ThreadDemoLambada {

	public static void main(String[] args) {
		Runnable r=()->{
		   for(int i=0;i<10;i++) {
			   System.out.println("Lambada : Child Thread");
		   }
		};
		Thread t= new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			   System.out.println("Lambada : Main Thread");
		   }

	}

}
