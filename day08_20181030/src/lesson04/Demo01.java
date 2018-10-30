package lesson04;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}

}

class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
}
