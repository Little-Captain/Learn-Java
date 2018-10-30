package lesson02;

public class Demo01 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.test();
	}

}

class Outer {
	
	int a = 12;
	
	private class Inner {
		
		public void test2() {
			System.out.println("a="+a);
		}
		
	}
	
	void test() {
		Inner inner = new Inner();
		inner.test2();
	}
	
}