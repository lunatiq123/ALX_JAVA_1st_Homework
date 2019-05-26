import java.util.Random;
import java.util.Scanner;

public class P3_3 {

    public static void main(String[] args) {

        int proba = 1;
        int x;
        int liczba;

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        x = r.nextInt(1000);
        System.out.println("Jaka to liczba?");

        while (true) {
            liczba = sc.nextInt();
            if (liczba == x) {
                System.out.println("Dobrze, to była " + proba + " próba");
                break;
            } else {
                if (liczba > x) {
                    System.out.println("Podana liczba jest za duża");
                } else if (liczba < x) {
                    System.out.println("Podana liczba jest za mała");
                }
                System.out.println("Próbuj dalej");
                proba++;
            }
        }
    }
}



