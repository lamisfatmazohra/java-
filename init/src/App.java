import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Livre livre; // declaration de instance
        livre = new Livre("your name", 204);
        System.out.println(livre.toString());
    }
}
