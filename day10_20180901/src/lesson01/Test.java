package lesson01;

public class Test {

	public static void main(String[] args) {
		Father son = new Son();
		son.drive();
		System.out.println(son.a);
	}

}

class Father {
	
	public static int a = 10;

	public void drive() {
		System.out.println("drive");
	}
	
}

class Son extends Father {
	
	public static int a = 20;
	
	@Override
	public void drive() {
		super.drive();
		System.out.println("Son drive");
	}
	
}
