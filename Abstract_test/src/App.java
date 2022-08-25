abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzz... Good night!");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Wan wan!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.sound();
        dog1.sleep();

        cat1.sound();
        cat1.sleep();

        Dog dog2 = new Dog();
        Cat cat2 = new Cat();

        dog2.sound();
        dog2.sleep();
        
        cat2.sound();
        cat2.sleep();
    }
}
