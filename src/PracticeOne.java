import java.util.Scanner;
public class PracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a is bigger than b");
        }
        else if (b > a) {
            System.out.println("b is bigger than a");
        }
        else if (a == b) {
            System.out.println(" a and b is equal");
        }
    }
}