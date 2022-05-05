package marwat98.com.github;
import java.util.Scanner;



public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        double x = scanner.nextDouble();
        for (int i = 0; i <= x; i++) {
            if(x % 2 ==0){
                x = i;
                i++;
            }
            System.out.println(x/2);
            break;
            
        }
        }
    }





