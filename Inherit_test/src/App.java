public class App {
    public static void main(String[] args) throws Exception {
        //Dog dog1 = new Dog();
        Dog dog2 = new Dog("Shiba", "azuki", 3);
        Dog dog3 = new Dog("sakura", 5);

        /*
        dog1.move();
        dog1.showInfo();
        */

        dog2.move();
        dog2.showInfo();

        dog3.move();
        dog3.showInfo();
    }
}
