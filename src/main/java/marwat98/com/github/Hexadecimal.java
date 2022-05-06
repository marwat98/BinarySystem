package marwat98.com.github;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Hexadecimal {
    public static void main(String[] args) {
        LinkedHashMap<String , String> ten = new LinkedHashMap<>();
        ten.put("0000", "0");
        ten.put("0001", "1");
        ten.put("0010", "2");
        ten.put("0011", "3");
        ten.put("0100", "4");
        ten.put("0101", "5");
        ten.put("0110", "6");
        ten.put("0111", "7");
        ten.put("1000", "8");
        ten.put("1001", "9");
        ten.put("1010", "A");
        ten.put("1011", "B");
        ten.put("1100", "C");
        ten.put("1101", "D");
        ten.put("1110", "E");
        ten.put("1111", "F");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
    }

}
