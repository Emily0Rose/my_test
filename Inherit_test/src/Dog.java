public class Dog extends Animal {
    private String name = "";
    private int age = 0;
    public Dog(String tp, String nm, int ag) {
        type = tp;
        name = nm;
        age = ag;
    }
    public Dog(String nm, int ag) {
        type = "Dog";
        name = nm;
        age = ag;
    }
    public void showInfo() {
        System.out.println("Type: " + type + " Name: " + name + " Age: " + age);
    }
}