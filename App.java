class OuterClass {
    int x = 2;

    class InnerClass {
        int y = 9;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("myOuter.x: " + myOuter.x + " myInner.y: " + myInner.y);
        System.out.println("x + y = " + myOuter.x + myInner.y); // 29
        System.out.println("x + y = " + (myOuter.x + myInner.y)); // 11
    }
}
