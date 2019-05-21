import java.util.Scanner;

public class P2_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wartość liczby a");
        double a = sc.nextDouble();

        System.out.println("Podaj wartość liczby b");
        double b = sc.nextDouble();

        System.out.println("Podaj znak działania jakie chcesz przeprowadzić (+, -, *, /)");





    }

}



/*
Zadanie 2.4
Kalkulator konsolowy
Napisz program działający w konsoli, który na podstawie dwóch podanych liczb oraz znaku
operacji między nimi obliczy wynik działania matematycznego. W przypadku podania
nieprawidłowej operacji lub złego formatu liczb program ma wyświetlić komunikat o błędzie.
Obsłuż co najmniej cztery podstawowe działania matematyczne (+ - * /), dodatkowo możesz
inne (sprawdź możliwości klasy Math).
Podaj działanie: 12 * 3
Wynik: 36
Wersja pierwsza: Program jednorazowo pyta o działanie, wyświetla wynik i kończy się.
Wersja druga: (niekoniecznie od razu) Program w pętli wielokrotnie pyta o działanie, a kończy
się np. gdy zamiast liczb zostanie wpisany inny napis. Jednym z możliwych zapisów jest pętla
while(sc.hasNextDouble()) { ...
Pokombinujcie...*/