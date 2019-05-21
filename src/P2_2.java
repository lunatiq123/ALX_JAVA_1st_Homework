
import javax.swing.JOptionPane;

public class P2_2 {

    public static void main(String[] args) {

        int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj numer dnia tygodnia:"));

        switch (numer) {
            case 1:
                JOptionPane.showMessageDialog(null, "To jest poniedzialek");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "To jest wtorek");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "To jest środa");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "To jest czwartek");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "To jest piątek");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "To jest sobota");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "To jest niedziela");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nie ma takiego numeru", "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
        }

        int ileDni = Integer.parseInt(JOptionPane.showInputDialog("Ile dni potrwa naprawa (max.7 dni)?"));

        int odbior = (numer + ileDni);

        if (odbior == 1) {
            JOptionPane.showMessageDialog(null, "Odbiór będzie w poniedziałek");
        }
        if (odbior == 8) {
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następny poniedziałek");
        }
        if (odbior == 2){
            JOptionPane.showMessageDialog(null, "Odbiór będzie we wtorek");
        }
        if (odbior == 9) {
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następny wtorek");
        }
        if (odbior == 3){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w środę");
        }
        if (odbior == 10){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następną środę");
        }
        if (odbior == 4){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w czwartek");
        }
        if (odbior == 11){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następny czwartek");
        }
        if (odbior == 5){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w piątek");
        }
        if (odbior == 12){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następny piątek");
        }
        if (odbior == 6){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w sobotę");
        }
        if (odbior == 13){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następną sobotę");
        }
        if (odbior == 7){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w niedzielę");
        }
        if (odbior == 14){
            JOptionPane.showMessageDialog(null, "Odbiór będzie w następną niedzielę");
        }
        if (odbior > 14) {
            JOptionPane.showMessageDialog(null, "Podano błędny czas naprawy", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
}

/*
 * Napisz taki program: użytkownik ma podać, w jaki dzień tygodnia oddał buty do
 * szewca (numer od 1 do 7). Ma też podać, ile dni będzie trwała naprawa.
 * Program ma wypisać, w jaki dzień tygodnia buty będą gotowe do odbioru. W
 * podstawowej wersji możesz wypisywać dzień odbioru też jako numer. W wersji
 * zaawansowanej spróbuj wypisywać dzień odbioru słownie i obsłużyć także
 * sytuacje, że naprawa trwa dłużej niż 7 dni.
 */