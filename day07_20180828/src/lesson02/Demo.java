package lesson02;

public class Demo {

    public static void main(String[] args) {
        Duck d = new Duck();
        d.speak();
    }

}

class Duck {
    
    String name;
    
    void speak() {
        System.out.println("我叫" + name);
    }
    
}
