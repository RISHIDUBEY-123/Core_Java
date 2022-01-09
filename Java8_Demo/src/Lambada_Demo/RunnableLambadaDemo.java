package Lambada_Demo;

public class RunnableLambadaDemo {

	public static void main(String[] args) {
		
		/*Legacy Way*/
		
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println("Interface New Runnabe 1");
			}
			
		};
		new Thread(runnable).start();
		
       /* Lambada way*/
		Runnable runnableLambada = () -> {
			System.out.println("Interface New Runnable 2");
		};
		new Thread(runnableLambada).start();
		
	}

}
