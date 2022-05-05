package marwat98.com.github;
import java.util.Scanner;



public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        double i = scanner.nextDouble();
        while(i <= 100){
            i++;
            if(i % 2 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}




