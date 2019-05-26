import java.util.Random;
import java.util.Scanner;

public class P3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(11);
        int y = r.nextInt(11);

        System.out.println(x + " i " + y);
        int iloczyn = x * y;


        while (true) {
            System.out.println("Jaki jest iloczyn tych liczb?");
            int wynik = sc.nextInt();
            if (wynik == iloczyn) {
                System.out.println("Dobrze");
                break;
            } else {
                System.out.println("Próbuj dalej");
            }
        }

    }

}







/*






 */