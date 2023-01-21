import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double result = (dog * 2.5 + cat * 4.0);
        System.out.printf("%.2f lv.",result);
    }
}
