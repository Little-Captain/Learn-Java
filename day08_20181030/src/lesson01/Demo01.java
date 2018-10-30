package lesson01;

public class Demo01 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.test2();
	}

}

class Outer {
	
	int a = 12;
	
	class Inner {
		
		public void test2() {
			System.out.println("a="+a);
		}
		
	}
	
}
