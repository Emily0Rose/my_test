import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pls enter sth...");
        String str1 = sc.nextLine();
        System.out.println("you entered: " + str1);

        System.out.println("pls enter sth...");
        String str2 = sc.next();
        System.out.println("you entered: " + str2);
    }
    
}
