package marwat98.com.github;
import java.util.Scanner;



public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        if (a == b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}





