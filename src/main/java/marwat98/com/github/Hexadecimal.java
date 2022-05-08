package marwat98.com.github;
import java.util.Scanner;


public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your values:");
        Integer binarynumber = Integer.parseInt(scanner.nextLine(), 2);
        String hexa = Integer.toHexString(binarynumber);
        System.out.println("Decimal: " + binarynumber);
        System.out.println("Hexadecimal: " + hexa);
    }

}









