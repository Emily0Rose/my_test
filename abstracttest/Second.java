abstract class Second {
    public abstract void study();
}

class GoodStudent extends Second {
    public void study() {
        System.out.println("I study very hard everyday.");
    }
}

class BadStudent extends Second {
    public void study() {
        System.out.println("I don't like study :(");
    }
}