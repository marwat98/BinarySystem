package marwat98.com.github;
import java.util.Scanner;



public class Hexadecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
       int a = scanner.nextInt();
        for (int i = 15; i >= 0; i--) {
            if((a & 0b1 << i) != 0b0 ){
                System.out.print("1");
            }
            else
                System.out.print("0");
        }
    }
}





