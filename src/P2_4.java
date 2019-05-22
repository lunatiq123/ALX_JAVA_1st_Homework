import java.util.Scanner;

public class P2_4 {

    public static void main(String[] args) {
        double a;
        double b;
        String znak;


        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wartość liczby a");
        a = sc.nextDouble();

        System.out.println("Podaj wartość liczby b");
        b = sc.nextDouble();

        System.out.println("Podaj znak działania jakie chcesz przeprowadzić (+, -, *, /)");
        znak = sc.next();

        switch (znak) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
    }
}
