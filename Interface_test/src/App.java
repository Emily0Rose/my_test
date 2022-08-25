interface Animal {
    public void sound();
    public void sleep();
}

interface Robot {
    public void showInfo();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("wan wan!");
    }
    public void sleep() {
        System.out.println("Good night wan!");
    }
}

class Cat implements Animal, Robot {
    public void sound() {
        System.out.println("meow");
    }
    public void sleep() {
        System.out.println("Good night meow!");
    }
    public void showInfo() {
        System.out.println("This is cat.");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.sound();
        dog1.sleep();

        cat1.sound();
        cat1.sleep();
        cat1.showInfo();
    }
}
