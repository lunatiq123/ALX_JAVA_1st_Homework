import java.util.Locale;
import java.util.Scanner;

public class P2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj bok a");
        double a = scanner.nextDouble();

        System.out.println("Podaj bok b");
        double b = scanner.nextDouble();

        System.out.println("Podaj bok c");
        double c = scanner.nextDouble();

        double p = ((a + b + c) / 2);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // bolean, ! znaczy is not
        if (!(s > 0)) {
            System.out.println("Nieprawidłowe wartości boków trójkąta");
        } else {
            System.out.println("Pole trójkąta wynosi " + s);
        }
    }
}
