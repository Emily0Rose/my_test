enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class App {
    public static void main(String[] args) throws Exception {
        Level myVer = Level.LOW;
        System.out.println(myVer);

        switch(myVer) {
            case LOW:
                System.out.println("Low Level");
                break;

            case MEDIUM:
                System.out.println("Medium Level");
                break;

            case HIGH:
                System.out.println("High Level");
                break;
        }

        for (Level i : Level.values()) {
            System.out.println(i);

            switch(i) {
                case LOW:
                    System.out.println("Low Level");
                    break;
    
                case MEDIUM:
                    System.out.println("Medium Level");
                    break;
    
                case HIGH:
                    System.out.println("High Level");
                    break;
            }
        }
    }
}
