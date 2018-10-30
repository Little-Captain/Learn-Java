package lesson03;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer.Inner();
		inner.test2();
		
		Outer.Inner.test();
	}

}

class Outer {
	
	static int a = 12;
	
	static class Inner {
		
		public void test2() {
			System.out.println("a="+a);
		}
		
		public static void test() {
			System.out.println("static test");
		}
		
	}
	
	void test() {
		Inner inner = new Inner();
		inner.test2();
	}
	
}
