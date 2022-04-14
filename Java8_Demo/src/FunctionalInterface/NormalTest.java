package FunctionalInterface;

interface NormalInter {
	public void m1();
}
class NormalImpl implements NormalInter{

	@Override
	public void m1() {
		System.out.println("Normal Implementation ");
		
	}
 }
class NormalTest{
	
public static void main (String[] args) {
	NormalInter i = new NormalImpl();
	i.m1();
	
}
}

