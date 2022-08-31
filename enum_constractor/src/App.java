enum MyEnum {
    hoge1(1),
    hoge2(2);

    private final int id;

    /* constructor must be private */
    private MyEnum(final int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static MyEnum valueOf(int id) {
        for(MyEnum num : MyEnum.values()) {
            if(num.getId() == id) {
                return num;
            }
        }

        throw new IllegalArgumentException("no such enum object for the id: " + id);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        MyEnum enumTest = MyEnum.valueOf(2);
        System.out.println(enumTest);

        /* Enum#ordinal()で宣言された順番をゲットする */
        int order = MyEnum.hoge1.ordinal();
        System.out.println(order);
    }
}


