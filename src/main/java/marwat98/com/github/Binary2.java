package marwat98.com.github;
import java.util.Scanner;

class Number {
    int x;
}


public class Binary2 {
    public static void main(String[] args) {
        Number number1 = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number: ");
        number1.x = scanner.nextInt();
        System.out.println("Value binary is: ");
        for (int i = 15; i >= 0 ; i--) {
            if((number1.x & 0b1 << i) != 0b0){
                System.out.print("1");
            }
            else
                System.out.print("0");
        }
    }
}
