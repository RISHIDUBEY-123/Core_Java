package FunctionalInterface;

interface AddInter {
	public void add(int a,int b);
}
class AddImpl implements AddInter{

	@Override
	public void add(int a,int b) {
		System.out.println("Normal Implementation :"+" " +(a+b));
		
	}
 }
class AddNormal{
	
public static void main (String[] args) {
	AddInter i = new AddImpl();
	i.add(10,20);
	i.add(100,200);
	
}
}
