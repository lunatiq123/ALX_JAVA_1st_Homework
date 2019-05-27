import java.util.Scanner;

public class P6_1 {
    public static void main(String[] args) {
        int wiek;
        int noc;
        int cena = 0;
        int rabat;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ile masz lat?");
        wiek = sc.nextInt();
        System.out.println("Ile nocy spędzisz w hotelu?");
        noc = sc.nextInt();

        if (wiek < 18) {
            cena = 100 * noc;
        } else if (wiek >= 18 && wiek < 65) {

            if (noc == 1) {
                cena = 200 * noc;
            } else if (noc >= 2 && noc < 5) {
                cena = 180 * noc;
            } else if (noc >= 500) {
                cena = 150 * noc;
            }
        } else if (wiek >= 65) {
            if (noc == 1) {
                cena = 200 * noc;
            } else if (noc >= 2 && noc < 5) {
                cena = 180 * noc;
            } else if (noc >= 500) {
                cena = 150 * noc;

            }

            System.out.println("Opłata wynosi " + cena + " PLN");
        }
    }
}



/*



Potem napisz taki program: użytkownik podaje swój wiek i ile nocy spędzi w hotelu, a program
wylicza, ile trzeba zapłacić. Zasady są takie:
- nieletni (poniżej 18 roku życia) płacą 100 zł za noc
- dorośli (ci, którzy mają przynajmniej 18 lat ale mniej niż 65 lat) płacą:
- 200 zł za noc, jeśli nocują jedną noc
- 180 zł za noc, jeśli nocują przynajmniej dwie ale mniej niż pięć nocy
- 150 zł za noc, jeśli nocują pięć lub więcej nocy
- emeryci (ci, którzy mają przynajmniej 65 lat), płacą jak dorośli, ale z 10% zniżki
Przykładowo: jeśli użytkownik ma 70 lat i spędzi w hotelu dziesięć nocy, zapłaci 150 zł za noc z
10% zniżki, czyli 150-15 zł za noc, czyli 135 zł za noc, czyli 1350 zł




 */