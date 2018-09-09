package lesson;

public class Demo01 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		Dog dog = new Dog();
		dog.eat();
		Animal[] animals = {cat, dog};
		for (int i = 0; i < animals.length; i++) {
			animals[i].eat();
		}
	}

}

abstract class Animal {
	
	abstract public void eat();
	
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃");
	}
	
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃");
	}
	
	
	
}
