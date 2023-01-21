import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m2 = Double.parseDouble(scanner.nextLine());
        double amount = m2 * 7.61;
        double discount = amount * 0.18;
        double result = amount - discount;
        System.out.printf( "The final prise is: %.2f lv.%n", result);
        System.out.printf( "The discount is: %.2f lv.%n",discount );
    }
}
