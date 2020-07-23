import java.util.Scanner;

public class ScannerTest {
    public static void main(final String[] args) {
        // TODO Auto-generated method Stub

        final Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // System.out.println("value = " +a);
        System.out.println("Enter a Charecter");
        final char c = scanner.next().charAt(0);
        System.out.println("value = " + c);
    }
}